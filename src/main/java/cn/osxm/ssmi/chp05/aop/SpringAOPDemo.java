/**
 * @Title: SpringAOPDemo.java
 * @Package cn.osxm.ssmi.chp5.aop
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018年12月12日 上午5:36:07
 * @version V1.0
 */

package cn.osxm.ssmi.chp05.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: SpringAOPDemo
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class SpringAOPDemo {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("cn/osxm/ssmi/chp5/spring-beans-aop.xml");
		HelloService helloService = (HelloService) context.getBean("helloService");
		helloService.sayHello();
	}

}
