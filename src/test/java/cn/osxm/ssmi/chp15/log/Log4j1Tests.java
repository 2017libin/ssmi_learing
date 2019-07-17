/**
 * @Title: Log4j1Tests.java
 * @Package cn.osxm.ssmi.chp15.log
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年7月13日 下午12:10:31
 * @version V1.0
 */

package cn.osxm.ssmi.chp15.log;

import org.junit.Test;

/**
  * @ClassName: Log4j1Tests
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class Log4j1Tests {
	  protected static final org.apache.log4j.Logger log4jLogger =  org.apache.log4j.LogManager.getLogger(Log4j1Tests.class);
	    @Test
	    public void log() {
	        log4jLogger.info("test");
	    }
}
