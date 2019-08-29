/**
 * @Title: AnnoConfigDemo.java
 * @Package cn.osxm.ssmi.chp4.javacfg
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月27日 下午4:20:14
 * @version V1.0
 */

package cn.osxm.ssmi.chp05.javacfg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cn.osxm.ssmi.com.anno.Foo;
import cn.osxm.ssmi.com.anno.UserServiceImpl;

/**
 * @ClassName: AnnoConfigDemo
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class AnnoConfigDemo {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println(context.getBean("foo"));
		UserServiceImpl userServiceImpl = context.getBean(UserServiceImpl.class);
		System.out.println(userServiceImpl);
		System.out.println(userServiceImpl.getUserNameById("1"));
		
		
		ApplicationContext context2 = new AnnotationConfigApplicationContext(Foo.class);
		System.out.println(context2.getBean("foo"));
		
		AnnotationConfigApplicationContext context3 = new AnnotationConfigApplicationContext();
		context3.register(AppConfig.class);
		context3.register(Foo.class);
		context3.scan("cn.osxm.ssmi.com.anno");
		context3.refresh();
	}
}
