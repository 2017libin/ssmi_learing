/**
 * @Title: CodeConfigDemo.java
 * @Package cn.osxm.ssmi.chp4.anno
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月7日 下午10:38:44
 * @version V1.0
 */

package cn.osxm.ssmi.chp4.anno;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName: CodeConfigDemo
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class CodeConfigDemo {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.getEnvironment().setActiveProfiles("dev");
		context.register(MyAppConfig.class);
		context.refresh();

		HelloClass hello = context.getBean(HelloClass.class);
		System.out.println(hello.getName());
		context.close();

	}
}
