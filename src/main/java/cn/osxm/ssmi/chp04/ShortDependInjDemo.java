/**
 * @Title: ShortDependInjDemo.java
 * @Package cn.osxm.ssmi.chp04
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年2月2日 上午7:35:25
 * @version V1.0
 */

package cn.osxm.ssmi.chp04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.osxm.ssmi.com.User;

/**
 * @ClassName: ShortDependInjDemo
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class ShortDependInjDemo {

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 */

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml", SimpleTypeDepDemo.class);

		User user = (User) context.getBean("user1");
		System.out.println(user.getName());

		user = (User) context.getBean("user2");
		System.out.println(user.getName());

		user = (User) context.getBean("user3");
		System.out.println(user.getName());

		user = (User) context.getBean("user4");
		System.out.println(user.getName());
	}

}
