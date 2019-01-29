/**
 * @Title: BeanAnnoDemo.java
 * @Package cn.osxm.ssmi.chp4.anno
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月21日 下午10:27:08
 * @version V1.0
 */

package cn.osxm.ssmi.chp04.anno;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.osxm.ssmi.com.User;
import cn.osxm.ssmi.com.anno.Foo;

/**
  * @ClassName: BeanAnnoDemo
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class BeanAnnoDemo {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("annoApplicationContext.xml",
				BeanAnnoDemo.class);
		BeanAnno beanAnno = (BeanAnno) context.getBean("beanAnno");
		System.out.println(beanAnno);
		//beanAnno.userInstance();
		//User user = (User) context.getBean("userInstance");
		//User user = (User) context.getBean(User.class);
		User user = (User) context.getBean("firstUser");
		System.out.println(user);
		
		
		
		
		context.close();
	}
}
