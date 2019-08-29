/**
 * @Title: SpringTransactionDemo.java
 * @Package cn.osxm.ssmi.chp14
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年7月11日 下午6:12:41
 * @version V1.0
 */

package cn.osxm.ssmi.chp14;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.osxm.ssmi.chp14.transaction.UserService;
import cn.osxm.ssmi.com.User;

/**
 * @ClassName: SpringTransactionDemo
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class SpringTransactionDemo {
	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 */

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-transaction.xml",
				SpringTransactionDemo.class);
		// UserService userService= context.getBean(UserServiceImpl.class);
		UserService userService = (UserService) context.getBean("userService");
		userService.addUser(new User("Wang wu"));
		// userService.addUserNoCommit(new User("Wang wu"));
	}

}
