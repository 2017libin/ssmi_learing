/**
 * @Title: ProxyFactoryBeanTest.java
 * @Package cn.osxm.ssmi.chp17
 * @Description: TODO
 * @author oscarchen
 * @date 2019Äê8ÔÂ6ÈÕ
 * @version V1.0
 */
package cn.osxm.ssmi.chp17;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
  * @ClassName: ProxyFactoryBeanTest
  * @Description: TODO
  * @author oscarchen
  */
public class ProxyFactoryBeanTest {
	 //@Test
    @SuppressWarnings("resource")
	public void testInterfaceProxy() {
        ApplicationContext context=new ClassPathXmlApplicationContext("cn/osxm/ssmi/chp17/proxyFactoryBean.xml");
        IUserService userService= (IUserService) context.getBean("userServiceProxy");
        userService.add();
    }
    
   @SuppressWarnings("resource")
@Test
    public void testClassProxy() {
        ApplicationContext context=new ClassPathXmlApplicationContext("cn/osxm/ssmi/chp17/proxyFactoryBean.xml");
        UserServiceNoInterface userServiceNoInterface= (UserServiceNoInterface) context.getBean("userServiceNoInterfaceProxy");
        userServiceNoInterface.add();
    }
    
   // @Test
    @SuppressWarnings("resource")
	public void testClassProxyWithInterceptor() {
        ApplicationContext context=new ClassPathXmlApplicationContext("cn/osxm/ssmi/chp17/proxyFactoryBean.xml");
        UserServiceNoInterface userServiceProxyWithInterceptor= (UserServiceNoInterface) context.getBean("userServiceProxyWithInterceptor");
        userServiceProxyWithInterceptor.add();
    }
}
