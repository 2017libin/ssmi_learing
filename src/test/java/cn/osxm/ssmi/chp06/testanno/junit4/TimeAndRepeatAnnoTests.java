/**
 * @Title: TimeAndRepeatAnnoTests.java
 * @Package cn.osxm.ssmi.chp06.testanno.junit4
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年3月31日 下午5:53:30
 * @version V1.0
 */

package cn.osxm.ssmi.chp06.testanno.junit4;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Repeat;
import org.springframework.test.annotation.Timed;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName: TimeAndRepeatAnnoTests
 * @Description: TODO
 * @author osxm:oscarxueming
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = { "classpath:cn/osxm/ssmi/chp06/testAnno.xml" })
public class TimeAndRepeatAnnoTests {

	@Before
	public void setup() {
		System.out.println("@Before Method");
	}

	/// @Test
	@SuppressWarnings("static-access")
	@Timed(millis = 1000)
	public void testMethod() {
		System.out.println("testMethod");
		try {
			Thread.currentThread().sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// @Test(timeout = 1000)
	@SuppressWarnings("static-access")
	public void testJunitTimeOut() {
		System.out.println("begin testJunitTimeOut");
		try {
			Thread.currentThread().sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end testJunitTimeOut");
	}

	// @Test
	@SuppressWarnings("static-access")
	@Timed(millis = 1000)
	public void testSpringTimeOut() throws InterruptedException {
		System.out.println("begin testSpringTimeOut");
		Thread.currentThread().sleep(2000);
		System.out.println("end testSpringTimeOut");
	}

	@Test
	@Repeat(5)
	public void testMore() {
		System.out.println("testMore");
	}
}
