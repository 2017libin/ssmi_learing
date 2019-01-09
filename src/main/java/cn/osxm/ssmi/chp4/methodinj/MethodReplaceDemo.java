/**
 * @Title: MethodReplaceDemo.java
 * @Package cn.osxm.ssmi.chp4.methodinj
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��1��8�� ����7:00:20
 * @version V1.0
 */

package cn.osxm.ssmi.chp4.methodinj;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.osxm.ssmi.chp4.AllCallbackService;
import cn.osxm.ssmi.chp4.CallbackDemo;

/**
 * @ClassName: MethodReplaceDemo
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class MethodReplaceDemo {
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml", MethodReplaceDemo.class);

		OldEraPeople  oldEraPeople = (OldEraPeople)context.getBean("oldEraPeople");
		String str = oldEraPeople.eat("����");
		System.out.println(str);
		context.close();

	}
}
