/**
 * @Title: AdviceDemo.java
 * @Package cn.osxm.ssmi.chp16.advice
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月19日 下午9:04:14
 * @version V1.0
 */

package cn.osxm.ssmi.chp16.advice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.osxm.ssmi.chp16.IUserService;

/**
  * @ClassName: AdviceDemo
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class AdviceDemo {

	/**
	  * @Title: main
	  * @Description: TODO
	  * @param args
	  */

	public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("cn/osxm/ssmi/chp16/applicationContext.xml");
        IUserService userService= (IUserService) context.getBean("userServiceProxy");
        userService.add();
        
        IUserService userException= (IUserService) context.getBean("exceptionProxy");
        try {
        	  userException.except();
        }catch(Exception e) {
        	
        }
      

	}

}
