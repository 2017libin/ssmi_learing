/**
 * @Title: DemoCollectionDepBean.java
 * @Package cn.osxm.ssmi.chp4
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月6日 下午4:07:56
 * @version V1.0
 */

package cn.osxm.ssmi.chp4;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
  * @ClassName: DemoCollectionDepBean
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class DemoCollectionDepBean {

	/**
	  * @Title: main
	  * @Description: TODO
	  * @param args
	  */

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml",
				DemoCollectionDepBean.class);
		CollectionDepBeanClass collectionDepBean= (CollectionDepBeanClass)context.getBean("collectionDepBean");
		System.out.println(collectionDepBean.getMyList().toString());
		System.out.println(collectionDepBean.getMySet().toString());
		System.out.println(collectionDepBean.getMyMap().keySet().toString());
		System.out.println(collectionDepBean.getMyProperties().toString());
		
		CollectionDepBeanClass collectionDepChildBean= (CollectionDepBeanClass)context.getBean("collectionDepChildBean");
		System.out.println(collectionDepChildBean.getMyProperties().toString());
		context.close();
	}

}
