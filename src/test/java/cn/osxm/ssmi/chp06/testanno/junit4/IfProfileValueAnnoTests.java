/**
 * @Title: IfProfileValueAnnoTests.java
 * @Package cn.osxm.ssmi.chp06.testanno
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年2月2日 上午5:57:40
 * @version V1.0
 */

package cn.osxm.ssmi.chp06.testanno.junit4;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.IfProfileValue;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName: IfProfileValueAnnoTests
 * @Description: TODO
 * @author osxm:oscarxueming
 */

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = { "classpath:cn/osxm/ssmi/chp06/testAnno.xml" })
@IfProfileValue(name = "env", value = "dev")

public class IfProfileValueAnnoTests {

	@BeforeClass
	public static void beforeClass() {
		//System.setProperty("env", "dev");
	}
	
	@IfProfileValue(name = "env", values = {"dev","prd"})
	@Test
	public void testMethod() {
		System.out.println("testMethod");
	}

}
