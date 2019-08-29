/**
 * @Title: HelloDemo.java
 * @Package cn.osxm.ssmi.chp03
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年2月25日 下午8:09:50
 * @version V1.0
 */

package cn.osxm.ssmi.chp03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: HelloDemo
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class HelloDemo {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml", HelloDemo.class);
		HelloService helloService = (HelloService) context.getBean("helloService");
		helloService.sayHello();
	}
}
