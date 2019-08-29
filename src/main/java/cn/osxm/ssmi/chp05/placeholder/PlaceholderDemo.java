/**
 * @Title: PlaceholderDemo.java
 * @Package cn.osxm.ssmi.chp05.placeholder
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月31日 上午5:46:11
 * @version V1.0
 */

package cn.osxm.ssmi.chp05.placeholder;
/**
  * @ClassName: PlaceholderDemo
  * @Description: TODO
  * @author osxm:oscarxueming
  */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.osxm.ssmi.com.MyDataSource;
public class PlaceholderDemo {

	/**
	  * @Title: main
	  * @Description: TODO
	  * @param args
	  */

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("cn/osxm/ssmi/chp05/placeholder.xml");
        MyDataSource myDataSource= (MyDataSource)context.getBean("myDataSource");
        System.out.println(myDataSource.getJdbcUrl());
    }

}
