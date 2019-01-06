/**
 * @Title: ContainerPostProcessor.java
 * @Package cn.osxm.ssmi.chp4
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月5日 上午8:46:53
 * @version V1.0
 */

package cn.osxm.ssmi.chp4;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.osxm.ssmi.chp2.HelloService;

/**
 * @ClassName: ContainerPostProcessor
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class ContainerPostProcessorDemo {

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 */

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml", ContainerPostProcessorDemo.class);
		HelloService helloService = (HelloService)context.getBean("helloService");
		helloService.sayHello();
		
	}

}
