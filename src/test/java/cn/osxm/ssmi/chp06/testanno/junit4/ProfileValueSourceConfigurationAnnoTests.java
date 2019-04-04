/**
 * @Title: ProfileValueSourceConfigurationAnnoTests.java
 * @Package cn.osxm.ssmi.chp06.testanno.junit4
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年3月31日 下午6:35:46
 * @version V1.0
 */

package cn.osxm.ssmi.chp06.testanno.junit4;

import org.junit.runner.RunWith;
import org.springframework.test.annotation.SystemProfileValueSource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
  * @ClassName: ProfileValueSourceConfigurationAnnoTests
  * @Description: TODO
  * @author osxm:oscarxueming
  */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = { "classpath:cn/osxm/ssmi/chp06/testAnno.xml" })
public class ProfileValueSourceConfigurationAnnoTests {

	
	public void testMethod() {
		SystemProfileValueSource s;
	}
}
