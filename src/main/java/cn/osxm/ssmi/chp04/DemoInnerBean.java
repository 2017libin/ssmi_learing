/**
 * @Title: DemoInnerBean.java
 * @Package cn.osxm.ssmi.chp4
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��1��6�� ����2:53:30
 * @version V1.0
 */

package cn.osxm.ssmi.chp04;

import java.util.Map;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: DemoInnerBean
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class DemoInnerBean {

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 */

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml",
				DemoInnerBean.class);
		OutBeanClass outBeanClass= (OutBeanClass)context.getBean("outBeanClass");
		System.out.println("�ڲ�bean������ name="+outBeanClass.getInnerBean().getName());
		context.close();
        
	}

}
