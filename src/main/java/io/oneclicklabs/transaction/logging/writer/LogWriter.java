/**
 * 
 */
package io.oneclicklabs.transaction.logging.writer;

import io.oneclicklabs.transaction.logging.types.TransactionMessage;

/**
 * Created by oneclicklabs.io on 2/10/17.
 */
public interface LogWriter {
	
    void writeTransactionlog(TransactionMessage message);
    boolean isEnabled();
}
