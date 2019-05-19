/**
 * @Title: StaticProxyDemo.java
 * @Package cn.osxm.ssmi.chp08.aop.proxy.statics
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月19日 上午10:23:04
 * @version V1.0
 */

package cn.osxm.ssmi.chp08.aop.proxy.statics;
import cn.osxm.ssmi.chp08.aop.IUserService;
import cn.osxm.ssmi.chp08.aop.UserService;
/**
  * @ClassName: StaticProxyDemo
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class StaticProxyDemo {

	/**
	  * @Title: main
	  * @Description: TODO
	  * @param args
	  */

	public static void main(String[] args) {

        IUserService userService= new UserService();
        UserServiceProxy userServiceProxy= new UserServiceProxy(userService);
        userServiceProxy.add();

	}

}
