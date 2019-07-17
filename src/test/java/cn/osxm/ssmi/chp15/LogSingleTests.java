/**
 * 
 */
package cn.osxm.ssmi.chp15;

import org.junit.Test;

/**
 * @author xuemi
 *
 */
public class LogSingleTests {
	 protected static final org.apache.logging.log4j.Logger log4j2Logger = org.apache.logging.log4j.LogManager.getLogger();

	    @Test
	    public void log4j2() {
	        log4j2Logger.debug("Debug Log.");
	        log4j2Logger.info("Info Log");
	        log4j2Logger.warn("Warn Log");
	        log4j2Logger.error("Error Log");
	        log4j2Logger.fatal("Fatal Log");
	    }
}
