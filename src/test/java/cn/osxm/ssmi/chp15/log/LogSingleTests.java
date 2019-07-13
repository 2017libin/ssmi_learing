/**
 * @Title: LogSingleTests.java
 * @Package cn.osxm.ssmi.chp15.log
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年7月13日 下午12:12:08
 * @version V1.0
 */

package cn.osxm.ssmi.chp15.log;

import org.junit.Test;

/**
 * @ClassName: LogSingleTests
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class LogSingleTests {
	protected static final org.apache.logging.log4j.Logger log4j2Logger = org.apache.logging.log4j.LogManager
			.getLogger();

	@Test
	public void log4j2() {
		log4j2Logger.debug("Debug Log.");
		log4j2Logger.info("Info Log");
		log4j2Logger.warn("Warn Log");
		log4j2Logger.error("Error Log");
		log4j2Logger.fatal("Fatal Log");
	}
}
