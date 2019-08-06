/**
 * @Title: ProxyFactoryBeanTests.java
 * @Package cn.osxm.ssmi.chp16
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月22日 下午10:06:10
 * @version V1.0
 */

package cn.osxm.ssmi.chp17;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.osxm.ssmi.chp17.IUserService;

/**
  * @ClassName: ProxyFactoryBeanTests
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class ProxyFactoryBeanTests {
	  @Test
	    public void testBefore() {
	        ApplicationContext context=new ClassPathXmlApplicationContext("cn/osxm/ssmi/chp16/ proxyFactoryBean.xml");
	        IUserService userService= (IUserService) context.getBean("userServiceProxy");
	        userService.add();
	    }
}
