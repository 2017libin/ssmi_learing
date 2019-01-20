/**
 * @Title: AnnoDemo.java
 * @Package cn.osxm.ssmi.chp4.anno
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��1��15�� ����5:44:24
 * @version V1.0
 */

package cn.osxm.ssmi.chp4.anno;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import cn.osxm.ssmi.com.Foo;

/**
  * @ClassName: AnnoDemo
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class AnnoDemo {

	/**
	  * @Title: main
	  * @Description: TODO
	  * @param args
	  */

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("annoApplicationContext.xml",
				AnnoDemo.class);
		//1.����@Componentע��ʵ����
		Foo foo = (Foo) context.getBean(Foo.class);
		System.out.println(foo);
		
		
		
		context.close();
	}

}
