/**
 * @Title: ImportAnnoDemo.java
 * @Package cn.osxm.ssmi.chp05.javacfg
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年3月19日 上午6:40:47
 * @version V1.0
 */

package cn.osxm.ssmi.chp05.javacfg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import cn.osxm.ssmi.com.User;
import cn.osxm.ssmi.com.Foo;

/**
 * @ClassName: ImportAnnoDemo
 * @Description: TODO
 * @author osxm:oscarxueming
 */
public class ImportAnnoConfigDemo {

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 */

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ImportAnnoConfig.class);
		System.out.println(context.getBean(Foo.class));
	}

}
