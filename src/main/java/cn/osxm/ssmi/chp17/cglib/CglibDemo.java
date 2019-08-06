/**
 * @Title: CglibDemo.java
 * @Package cn.osxm.ssmi.chp08.aop.cglib
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月19日 上午10:21:53
 * @version V1.0
 */

package cn.osxm.ssmi.chp17.cglib;
import cn.osxm.ssmi.chp17.UserServiceNoInterface;
import net.sf.cglib.proxy.Enhancer;

/**
  * @ClassName: CglibDemo
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class CglibDemo {

	/**
	  * @Title: main
	  * @Description: TODO
	  * @param args
	  */

	public static void main(String[] args) {

	    Enhancer enhancer = new Enhancer();  
        enhancer.setSuperclass(UserServiceNoInterface.class);  
        enhancer.setCallback(new AddMethodInterceptor());  
        UserServiceNoInterface userService = (UserServiceNoInterface)enhancer.create();
        userService.add();

	}

}
