/**
 * @Title: autowireCfgDemo.java
 * @Package cn.osxm.ssmi.chp4.autowire
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月26日 上午10:53:25
 * @version V1.0
 */

package cn.osxm.ssmi.chp4.autowire;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.osxm.ssmi.chp4.anno.AnnoDemo;
import cn.osxm.ssmi.com.Bar;

/**
 * @ClassName: autowireCfgDemo
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class autowireCfgDemo {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("cn/osxm/ssmi/chp4/anno/autowireDepend.xml");
		Bar bar = (Bar)context.getBean("bar");
		System.out.println(bar.getFoo());;
		context.close();
	}
}
