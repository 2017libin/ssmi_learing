/**
 * @Title: FieldInjectDepTest.java
 * @Package cn.osxm.ssmi.chp6.integ
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月12日 下午4:44:01
 * @version V1.0
 */

package cn.osxm.ssmi.chp06.integ;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import cn.osxm.ssmi.chp02.HelloService;

/**
 * @ClassName: FieldInjectDepTest
 * @Description: TODO
 * @author osxm:oscarxueming
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = { "classpath:cn/osxm/ssmi/chp6/applicationContext.xml" })
public class FieldInjectDepTest {
	
	@Autowired
	private HelloService helloService;

	@Test
	public void getHello() {
		String hello = helloService.getHello();
		Assert.assertSame(hello, "Hello");
	}
}
