/**
 * 
 */
package io.oneclicklabs.transaction.logging.writer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import io.oneclicklabs.transaction.logging.types.PayloadMessage;

/**
 * Created by oneclicklabs.io on 2/10/17.
 */
@Component
public class ConsoleLogWriter implements LogWriter {

	public static final String PAYLOAD_LOGGER = "io.oneclicklabs.payload.logger";

	@Value("${payload.logger.enabled:true}")
	public boolean PAYLOAD_LOGGER_ENABLED;

	private static final Logger LOG = LoggerFactory.getLogger(PAYLOAD_LOGGER);

	@Override
	public void writeTransactionlog(PayloadMessage message) {
		LOG.info("[payloadmessage] {}", message.toJson(true, true));
	}

	@Override
	public boolean isEnabled() {
		return PAYLOAD_LOGGER_ENABLED;
	}

}
