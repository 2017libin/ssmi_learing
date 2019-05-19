/**
 * @Title: UserSerivceInvocationHandler.java
 * @Package cn.osxm.ssmi.chp08.aop.proxy.dynamic
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��5��19�� ����12:39:10
 * @version V1.0
 */

package cn.osxm.ssmi.chp08.aop.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
  * @ClassName: UserSerivceInvocationHandler
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class UserSerivceInvocationHandler  implements InvocationHandler {
	private Object obj;

	UserSerivceInvocationHandler(Object obj) {
		this.obj = obj;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("ǰ�ô���");
		Object ret = method.invoke(obj, args);
		System.out.println("���ô���");
		return ret;
	}
}
