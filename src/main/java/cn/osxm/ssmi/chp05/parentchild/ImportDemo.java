/**
 * @Title: ImportDemo.java
 * @Package cn.osxm.ssmi.chp5.parentchild
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月30日 上午5:06:21
 * @version V1.0
 */

package cn.osxm.ssmi.chp05.parentchild;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
  * @ClassName: ImportDemo
  * @Description: TODO
  * @author osxm:oscarxueming
  */

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
