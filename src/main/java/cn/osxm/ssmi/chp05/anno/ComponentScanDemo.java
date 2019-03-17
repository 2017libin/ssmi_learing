/**
 * @Title: ComponentScanDemo.java
 * @Package cn.osxm.ssmi.chp05
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年3月15日 下午10:42:33
 * @version V1.0
 */

package cn.osxm.ssmi.chp05.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.osxm.ssmi.chp05.PropertyEditorDemo;
import cn.osxm.ssmi.com.anno.UserController;
import cn.osxm.ssmi.com.anno.UserServiceImpl;

/**
 * @ClassName: ComponentScanDemo
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class ComponentScanDemo {

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 */

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("componentScan.xml", ComponentScanDemo.class);
		System.out.println("Service:"+context.getBean(UserServiceImpl.class));
		System.out.println("Controller:"+context.getBean(UserController.class));
		
	}

}
