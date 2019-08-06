/**
 * @Title: SpringCgLibDemo.java
 * @Package cn.osxm.ssmi.chp08.aop.cglib
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月19日 下午1:42:51
 * @version V1.0
 */

package cn.osxm.ssmi.chp17.cglib;

import org.springframework.cglib.proxy.Enhancer;

import cn.osxm.ssmi.chp17.UserServiceNoInterface;


/**
  * @ClassName: SpringCgLibDemo
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class SpringCgLibDemo {

	/**
	  * @Title: main
	  * @Description: TODO
	  * @param args
	  */

	public static void main(String[] args) {

	    Enhancer enhancer = new Enhancer();  
        enhancer.setSuperclass(UserServiceNoInterface.class);  
        enhancer.setCallback(new SpringAddMethodInterceptor());
        UserServiceNoInterface userService = (UserServiceNoInterface)enhancer.create();
        userService.add();

	}

}
