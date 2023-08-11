/**
 * @Title: ApplicationContextDemo.java
 * @Package cn.osxm.ssmi.chp02
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018年12月4日 上午6:50:20
 * @version V1.0
 */

package cn.osxm.ssmi.chp02;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @ClassName: ApplicationContextDemo
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class ApplicationContextDemo {

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 */

	@SuppressWarnings("resource")
	public static void main(String[] args) {

//		ApplicationContext context = null;
//		 1.配置文件位于类的根目录
//		 context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		context = new FileSystemXmlApplicationContext("classpath:applicationContext.xml ");

		// 2.配置文件位于类根目录的子目录
		// context = new
		// ClassPathXmlApplicationContext("cn/osxm/ssmi/chp02/applicationContext.xml");
		//context = new FileSystemXmlApplicationContext("classpath:cn/osxm/ssmi/chp02/applicationContext.xml ");

		//context = new FileSystemXmlApplicationContext("applicationContext.xml");
		
		//context = new FileSystemXmlApplicationContext("config/applicationContext.xml");
		//context = new FileSystemXmlApplicationContext("file:///D:/devworkspace/ecpphoton/ssmi/applicationContext.xml");
		
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.setValidating(false);
		context.load("classpath:applicationContext.xml");
		context.refresh();

		HelloService helloService = (HelloService) context.getBean("helloService");
		helloService.sayHello();
	}

}
