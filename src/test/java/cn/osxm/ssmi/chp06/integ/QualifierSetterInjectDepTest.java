/**
 * @Title: QualifierSetterInjectDepTest.java
 * @Package cn.osxm.ssmi.chp6.integ
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月12日 下午4:46:19
 * @version V1.0
 */

package cn.osxm.ssmi.chp06.integ;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import cn.osxm.ssmi.chp02.HelloService;

/**
 * @ClassName: QualifierSetterInjectDepTest
 * @Description: TODO
 * @author osxm:oscarxueming
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = { "classpath:cn/osxm/ssmi/chp6/applicationContext.xml" })
public class QualifierSetterInjectDepTest {
	private HelloService helloService;

	@Autowired
	public void setHelloService(@Qualifier("helloService2") HelloService helloService) {
		this.helloService = helloService;
	}

	@Test
	public void getHello() {
		String hello = helloService.getHello();
		Assert.assertTrue(hello.equals("Hello,Oscar"));
	}
}
