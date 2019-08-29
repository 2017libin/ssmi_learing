/**
 * @Title: PropertySourcesAnnoDemo.java
 * @Package cn.osxm.ssmi.chp05.placeholder
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月31日 上午5:47:44
 * @version V1.0
 */

package cn.osxm.ssmi.chp05.placeholder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cn.osxm.ssmi.com.MyDataSource;

/**
  * @ClassName: PropertySourcesAnnoDemo
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class PropertySourcesAnnoDemo {

	/**
	  * @Title: main
	  * @Description: TODO
	  * @param args
	  */

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		  ApplicationContext context = new AnnotationConfigApplicationContext(PropertySourcesAnno.class);
	        MyDataSource myDataSource= (MyDataSource)context.getBean("myDataSource");
	        System.out.println(myDataSource.getJdbcUrl());

	}

}
