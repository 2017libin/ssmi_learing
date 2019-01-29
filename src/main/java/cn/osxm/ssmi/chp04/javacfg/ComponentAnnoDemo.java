/**
 * @Title: ComponentAnnoDemo.java
 * @Package cn.osxm.ssmi.chp4.javacfg
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月27日 下午6:37:40
 * @version V1.0
 */

package cn.osxm.ssmi.chp04.javacfg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cn.osxm.ssmi.com.Bar;

/**
 * @ClassName: ComponentAnnoDemo
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class ComponentAnnoDemo {
	public static void main(String[] args) {
		//AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentAnno.class);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("cn.osxm.ssmi.chp4.javacfg");
		context.refresh();
		Bar bar = (Bar)context.getBean("bar");
		System.out.println(bar.getFoo());
		
	}
}
