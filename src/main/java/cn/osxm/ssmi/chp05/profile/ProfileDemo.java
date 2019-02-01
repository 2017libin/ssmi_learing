/**
 * @Title: ProfileDemo.java
 * @Package cn.osxm.ssmi.chp5.profile
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月30日 上午5:08:44
 * @version V1.0
 */

package cn.osxm.ssmi.chp05.profile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
  * @ClassName: ProfileDemo
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class ProfileDemo {
	 /**
     * @Title: main
     * @Description: TODO
     * @param args
     */

   public static void main(String[] args) {
	   System.setProperty("spring.profiles.active", "qa");
	   
	   
       //spring.profiles.default
       AbstractApplicationContext context = new ClassPathXmlApplicationContext("cn/osxm/ssmi/chp5/profiles.xml");  
       MyDataSource myDataSource = (MyDataSource)context.getBean("dataSource");
       System.out.println(myDataSource.getUrl());
       
   }
}
