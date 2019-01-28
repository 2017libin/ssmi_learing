/**
 * @Title: SpringTest.java
 * @Package cn.osxm.ssmi.chp6
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月7日 下午10:33:15
 * @version V1.0
 */

package cn.osxm.ssmi.chp6;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import cn.osxm.ssmi.chp2.HelloService;

/**
 * @ClassName: SpringTest
 * @Description: TODO
 * @author osxm:oscarxueming
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "classpath:cn/osxm/ssmi/chp6/applicationContext.xml")
@ContextConfiguration({"classpath:cn/osxm/ssmi/chp6/applicationContext.xml", "classpath:cn/osxm/ssmi/chp6/webApplicationContext.xml"})
public class SpringTest {

	@Autowired
	private HelloService helloService;

	@Test
	public void hello() {
		helloService.sayHello();

	}
}