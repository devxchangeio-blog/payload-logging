/**
 * 
 */
package io.oneclicklabs.logging.writer;

import io.oneclicklabs.logging.types.PayloadMessage;

/**
 * Created by oneclicklabs.io on 2/10/17.
 */
public interface LogWriter {
	
    void writeTransactionlog(PayloadMessage message);
    boolean isEnabled();
}
