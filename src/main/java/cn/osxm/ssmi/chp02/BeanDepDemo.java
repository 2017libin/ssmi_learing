/**
 * @Title: BeanDepDemo.java
 * @Package cn.osxm.ssmi.chp02
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018年12月9日 上午7:34:36
 * @version V1.0
 */

package cn.osxm.ssmi.chp02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
  * @ClassName: BeanDepDemo
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class BeanDepDemo {

	/**
	  * @Title: main
	  * @Description: TODO
	  * @param args
	  */

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:ssmi/chp02/spring-beans.xml");
		UserService userService = (UserService)context.getBean("userService");
		userService.add("Zhang San");

		UserService2 userService2 = (UserService2)context.getBean("userService2");
		userService2.add("Zhang San");
	}

}
