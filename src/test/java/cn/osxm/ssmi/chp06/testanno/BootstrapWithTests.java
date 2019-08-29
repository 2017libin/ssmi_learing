/**
 * @Title: BootstrapWithTests.java
 * @Package cn.osxm.ssmi.chp06.testanno
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年4月2日 上午5:30:21
 * @version V1.0
 */

package cn.osxm.ssmi.chp06.testanno;


import org.junit.jupiter.api.Test;
import org.springframework.test.context.BootstrapWith;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.support.DefaultTestContextBootstrapper;

/**
  * @ClassName: BootstrapWithTests
  * @Description: TODO
  * @author osxm:oscarxueming
  */
@BootstrapWith(DefaultTestContextBootstrapper.class)
//@BootstrapWith(WebTestContextBootstrapper.class)
@SpringJUnitConfig(locations = "classpath:cn/osxm/ssmi/chp06/testAnno.xml")
public class BootstrapWithTests {
	@Test
	public void testMethod() {
		System.out.println("testMethod");
	}
}
