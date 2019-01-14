/**
 * @Title: SetterInjectDepTest.java
 * @Package cn.osxm.ssmi.chp6.integ
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月12日 下午4:48:12
 * @version V1.0
 */

package cn.osxm.ssmi.chp6.integ;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import cn.osxm.ssmi.chp2.HelloService;

/**
 * @ClassName: SetterInjectDepTest
 * @Description: TODO
 * @author osxm:oscarxueming
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = { "classpath:cn/osxm/ssmi/chp6/applicationContext.xml" })
public class SetterInjectDepTest {
	private HelloService helloService;

	@Autowired
	public void setHelloService(HelloService helloService) {
		this.helloService = helloService;
	}

	@Test
	public void getHello() {
		String hello = helloService.getHello();
		Assert.assertTrue(hello.equals("Hello"));
	}
}
