package cn.osxm.ssmi.chp08.parentchild;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ImportDemo {
	  /**
     * @Title: main
     * @Description: TODO
     * @param args
     */

   public static void main(String[] args) {
       
       ApplicationContext parentContext = new ClassPathXmlApplicationContext("cn/osxm/ssmi/chp5/import.xml");    
       
   }

}
