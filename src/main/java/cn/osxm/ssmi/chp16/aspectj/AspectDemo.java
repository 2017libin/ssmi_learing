/**
 * @Title: AspectDemo.java
 * @Package cn.osxm.ssmi.chp08.aop.aspect
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月18日 下午5:38:44
 * @version V1.0
 */
package cn.osxm.ssmi.chp16.aspectj;
/**
  * @ClassName: AspectDemo
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class AspectDemo {
	/**
	  * @Title: main
	  * @Description: TODO
	  * @param args
	  */

	public static void main(String[] args) {
		UserService userService = new UserService();
        userService.add();
	}
}
