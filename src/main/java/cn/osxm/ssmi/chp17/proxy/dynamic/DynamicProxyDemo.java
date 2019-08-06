/**
 * @Title: DynamicProxyDemo.java
 * @Package cn.osxm.ssmi.chp08.aop.proxy.dynamic
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月19日 下午12:41:01
 * @version V1.0
 */

package cn.osxm.ssmi.chp17.proxy.dynamic;

import java.lang.reflect.Proxy;

import cn.osxm.ssmi.chp17.IUserService;
import cn.osxm.ssmi.chp17.UserService;

/**
  * @ClassName: DynamicProxyDemo
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class DynamicProxyDemo {

	/**
	  * @Title: main
	  * @Description: TODO
	  * @param args
	  */

	public static void main(String[] args) {
		
		IUserService userService= new UserService();
		UserSerivceInvocationHandler invocationHandler= new UserSerivceInvocationHandler(userService);
		IUserService userServiceProxy = (IUserService) Proxy.newProxyInstance(UserService.class.getClassLoader(),
				new Class[] { IUserService.class }, invocationHandler);
		userServiceProxy.add();

	}

}
