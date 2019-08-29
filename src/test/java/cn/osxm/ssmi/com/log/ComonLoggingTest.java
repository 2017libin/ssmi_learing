/**
 * @Title: ComonLoggingTest.java
 * @Package cn.osxm.ssmi.com.log
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年3月1日 下午9:47:58
 * @version V1.0
 */

package cn.osxm.ssmi.com.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @ClassName: ComonLoggingTest
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class ComonLoggingTest {
	private static final Logger logger = LogManager.getLogger(ComonLoggingTest.class.getName());

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 */

	public static void main(String[] args) {
        logger.debug("Debug Log.");
        logger.info("Info Log");
        logger.warn("Warn Log");
        logger.error("Error Log");
        logger.fatal("Fatal Log");

	}
}
