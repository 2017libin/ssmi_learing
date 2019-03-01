/**
 * @Title: ComonLoggingTest.java
 * @Package cn.osxm.ssmi.com.log
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年3月1日 下午9:47:58
 * @version V1.0
 */

package cn.osxm.ssmi.com.log;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @ClassName: ComonLoggingTest
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class ComonLoggingTest {
	static Log log = LogFactory.getLog(ComonLoggingTest.class);

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 */

	public static void main(String[] args) {
		log.debug("Debug Log.");
		log.info("Info Log");
		log.warn("Warn Log");
		log.error("Error Log");
		log.fatal("Fatal Log");

	}
}
