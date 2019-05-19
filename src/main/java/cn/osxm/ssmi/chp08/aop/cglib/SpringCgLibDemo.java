/**
 * @Title: SpringCgLibDemo.java
 * @Package cn.osxm.ssmi.chp08.aop.cglib
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��5��19�� ����1:42:51
 * @version V1.0
 */

package cn.osxm.ssmi.chp08.aop.cglib;

import org.springframework.cglib.proxy.Enhancer;

import cn.osxm.ssmi.chp08.aop.UserServiceImpl;


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
        enhancer.setSuperclass(UserServiceImpl.class);  
        enhancer.setCallback(new SpringAddMethodInterceptor());
        UserServiceImpl userService = (UserServiceImpl)enhancer.create();
        userService.add();

	}

}
