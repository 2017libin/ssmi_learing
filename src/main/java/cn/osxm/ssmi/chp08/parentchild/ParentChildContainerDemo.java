/**
 * @Title: ParentChildContainerDemo.java
 * @Package cn.osxm.ssmi.chp08.parentchild
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月18日 下午10:22:26
 * @version V1.0
 */

package cn.osxm.ssmi.chp08.parentchild;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.osxm.ssmi.chp08.parentchild.parent.UserDao;
import cn.osxm.ssmi.chp08.parentchild.parent.UserService;
/**
  * @ClassName: ParentChildContainerDemo
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class ParentChildContainerDemo {
	/**
     * @Title: main
     * @Description: TODO
     * @param args
     */

   public static void main(String[] args) {
       
       //
      ApplicationContext parentContext = new ClassPathXmlApplicationContext("cn/osxm/ssmi/chp5/parent.xml");    
      ApplicationContext childContext = new ClassPathXmlApplicationContext(new String[] {"cn/osxm/ssmi/chp5/child.xml"},parentContext);  
      UserService userService = (UserService)childContext.getBean("userService");     
      userService.setUserDao((UserDao)childContext.getBean("childUserDao"));
      System.out.println(userService.get());
      
      //以下在XML配置父容器关系
      ApplicationContext allContext = new ClassPathXmlApplicationContext("cn/osxm/ssmi/chp5/parent-child.xml");  
      parentContext = (ApplicationContext) allContext.getBean("parentContext");
      childContext = (ApplicationContext) allContext.getBean("childContext");
      userService = (UserService)parentContext.getBean("userService");     
      userService.setUserDao((UserDao)childContext.getBean("childUserDao"));
      System.out.println(userService.get());
      
   }
}
