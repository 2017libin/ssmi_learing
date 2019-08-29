/**
 * @Title: ConfigurationAnnoDemo.java
 * @Package cn.osxm.ssmi.chp4.javacfg
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月27日 下午9:50:56
 * @version V1.0
 */

package cn.osxm.ssmi.chp05.javacfg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cn.osxm.ssmi.com.Bar;

/**
 * @ClassName: ConfigurationAnnoDemo
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class ConfigurationAnnoDemo {

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 */

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationAnno.class);
		Bar bar = (Bar) context.getBean("bar");
		System.out.println(bar.getFoo());
		Bar bar2 = (Bar) context.getBean("bar2");
		System.out.println(bar2.getFoo());
	}

}
