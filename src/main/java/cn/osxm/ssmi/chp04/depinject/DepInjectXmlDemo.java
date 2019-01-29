/**
 * @Title: DepInjectXmlDemo.java
 * @Package cn.osxm.ssmi.chp04.depinject
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月30日 上午6:06:03
 * @version V1.0
 */

package cn.osxm.ssmi.chp04.depinject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.osxm.ssmi.chp04.BeanInitialDemo;
import cn.osxm.ssmi.com.Baz;

/**
 * @ClassName: DepInjectXmlDemo
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class DepInjectXmlDemo {

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 */

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("cn/osxm/ssmi/chp04/depInject.xml");
		Baz baz = (Baz)context.getBean("baz");
		System.out.println(baz.getFoo());
		
	}

}
