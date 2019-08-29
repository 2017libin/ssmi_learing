/**
 * @Title: DiffScopeInjectDemo.java
 * @Package cn.osxm.ssmi.chp04.depinject
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月31日 上午6:36:28
 * @version V1.0
 */

package cn.osxm.ssmi.chp04.depinject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.osxm.ssmi.com.Baz;

/**
  * @ClassName: DiffScopeInjectDemo
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class DiffScopeInjectDemo {

	/**
	  * @Title: main
	  * @Description: TODO
	  * @param args
	  */

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("cn/osxm/ssmi/chp04/depInject.xml");
		Baz baz = (Baz)context.getBean("baz");
		System.out.println(baz.getFoo());
	}

}
