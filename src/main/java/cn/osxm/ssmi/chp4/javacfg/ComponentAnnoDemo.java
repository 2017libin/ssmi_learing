/**
 * @Title: ComponentAnnoDemo.java
 * @Package cn.osxm.ssmi.chp4.javacfg
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��1��27�� ����6:37:40
 * @version V1.0
 */

package cn.osxm.ssmi.chp4.javacfg;

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
		ApplicationContext context = new AnnotationConfigApplicationContext(ComponentAnno.class);
		Bar bar = (Bar)context.getBean("bar");
		System.out.println(bar.getFoo());
		
	}
}