/**
 * @Title: ApplicationContextDemo.java
 * @Package cn.osxm.ssmi.chp2
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018年12月4日 上午6:50:20
 * @version V1.0
 */

package cn.osxm.ssmi.chp2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
  * @ClassName: ApplicationContextDemo
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class ApplicationContextDemo {

	/**
	  * @Title: main
	  * @Description: TODO
	  * @param args
	  */

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("cn/osxm/ssmi/chp2/spring-beans.xml"); 
		HelloService helloService = (HelloService)context.getBean("helloService");
		helloService.sayHello();
		

	}

}
