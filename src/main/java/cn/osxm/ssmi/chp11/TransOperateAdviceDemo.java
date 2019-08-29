/**
 * @Title: TransOperateAdviceDemo.java
 * @Package cn.osxm.ssmi.chp11
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018年12月28日 下午9:29:56
 * @version V1.0
 */

package cn.osxm.ssmi.chp11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.osxm.ssmi.chp02.User;
import cn.osxm.ssmi.chp02.UserService;

/**
 * @ClassName: TransOperateAdviceDemo
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class TransOperateAdviceDemo {
	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 */

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml",
				TransOperateAdviceDemo.class);
		UserService userService = (UserService) context.getBean("userService");
		userService.update(new User("001", "Oscar"));
	}
}
