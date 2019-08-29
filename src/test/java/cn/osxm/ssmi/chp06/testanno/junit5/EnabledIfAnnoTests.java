/**
 * @Title: EnabledIfAnnoTests.java
 * @Package cn.osxm.ssmi.chp06.testanno
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年2月2日 上午5:58:36
 * @version V1.0
 */

package cn.osxm.ssmi.chp06.testanno.junit5;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.EnabledIf;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * @ClassName: EnabledIfAnnoTests
 * @Description: TODO
 * @author osxm:oscarxueming
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = { "classpath:cn/osxm/ssmi/chp06/testAnno.xml" })
//@EnabledIf("false")
public class EnabledIfAnnoTests {
	@BeforeAll
	public static void beforeClass() {
		System.setProperty("env", "dev");
		System.setProperty("tests.enable","true");
	}

	@Test
	@EnabledIf("#{systemProperties['tests.enable'].toLowerCase().equals('true')}")
	// @EnabledIf("#{systemProperties['os.name'].toLowerCase().contains('window')}")
	//@EnabledIf("${tests.enable}")
	// @EnabledIf("true")
	// @IfProfileValue(name = "env", value = "dev")
	// @Disabled
	public void testMethod() {
		System.out.println("testMethod");
	}
}
