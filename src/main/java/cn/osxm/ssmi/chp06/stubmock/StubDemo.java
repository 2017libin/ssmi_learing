/**
 * @Title: StubDemo.java
 * @Package cn.osxm.ssmi.chp6.stubmock
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月14日 下午9:59:32
 * @version V1.0
 */

package cn.osxm.ssmi.chp06.stubmock;

import cn.osxm.ssmi.com.UserDao;
import cn.osxm.ssmi.com.UserServiceImpl;

/**
 * @ClassName: StubDemo
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class StubDemo {
	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserServiceImpl userService = new UserServiceImpl();
		UserDao userDao = new UserDaoStub();
		userService.setUserDao(userDao);
		userService.getUserById("");
	}
}
