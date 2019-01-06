/**
 * @Title: DemoCircularDepend.java
 * @Package cn.osxm.ssmi.chp4
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月7日 上午5:42:37
 * @version V1.0
 */

package cn.osxm.ssmi.chp4;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: DemoCircularDepend
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class DemoCircularDepend {

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 */

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml",
				DemoCircularDepend.class);
		BeanCClass beanC = (BeanCClass)context.getBean("beanC");
		beanC.foo();
		context.close();

	}

}
