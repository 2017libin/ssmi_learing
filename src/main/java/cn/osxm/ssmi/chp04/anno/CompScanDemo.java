/**
 * @Title: CompScanDemo.java
 * @Package cn.osxm.ssmi.chp4.anno
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��1��21�� ����9:46:35
 * @version V1.0
 */

package cn.osxm.ssmi.chp04.anno;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.osxm.ssmi.com.anno.Bar;
import cn.osxm.ssmi.com.anno.Baz;
import cn.osxm.ssmi.com.anno.Foo;
import cn.osxm.ssmi.com.anno.UserController;
import cn.osxm.ssmi.com.anno.UserDaoImpl;

/**
 * @ClassName: CompScanDemo
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class CompScanDemo {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("annoApplicationContext.xml",
				CompScanDemo.class);
		// 1.����@Componentע��ʵ����
		//Foo foo = (Foo) context.getBean(Foo.class);
		//System.out.println(foo);
		//System.out.println((Bar)context.getBean(Bar.class));
		System.out.println((Baz)context.getBean(Baz.class));
		//System.out.println((UserController)context.getBean(UserController.class));
		
		
		System.out.println((UserDaoImpl)context.getBean(UserDaoImpl.class));
		context.close();
	}

}
