/**
 * @Title: InheritedBeanDemo.java
 * @Package cn.osxm.ssmi.chp4
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��1��6�� ����10:05:57
 * @version V1.0
 */

package cn.osxm.ssmi.chp4;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
  * @ClassName: InheritedBeanDemo
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class InheritedBeanDemo {

	/**
	  * @Title: main
	  * @Description: TODO
	  * @param args
	  */

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml", InheritedBeanDemo.class);
		ChildBean childBean= (ChildBean)context.getBean("childBean");
		//ParentBean parentBean = (ParentBean)context.getBean("parentBean");
		//System.out.println("����bean"+parentBean);
		System.out.println("[��bean����]name="+childBean.getName());
		System.out.println("[��bean����]age="+childBean.getAge());
		context.close();
	}

}
