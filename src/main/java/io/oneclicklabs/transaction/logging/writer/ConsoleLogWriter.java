/**
 * 
 */
package io.oneclicklabs.transaction.logging.writer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import io.oneclicklabs.transaction.logging.types.TransactionMessage;

/**
 * Created by oneclicklabs.io on 2/10/17.
 */
@Component
public class ConsoleLogWriter implements LogWriter {

	public static final String TRANSACTION_LOGGER = "io.oneclicklabs.transaction.logger";

	@Value("${transaction.logger.enabled}")
	public boolean TRANSACTION_LOGGER_ENABLED = true;

	private static final Logger LOG = LoggerFactory.getLogger(TRANSACTION_LOGGER);

	@Override
	public void writeTransactionlog(TransactionMessage message) {
		LOG.info("[transactionmessage] {}", message.toJson(true, true));
	}

	@Override
	public boolean isEnabled() {
		return TRANSACTION_LOGGER_ENABLED;
	}

}
