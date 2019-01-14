/**
 * @Title: EasyMockDemo.java
 * @Package cn.osxm.ssmi.chp6.stubmock
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月14日 下午9:50:37
 * @version V1.0
 */

package cn.osxm.ssmi.chp6.stubmock;

import org.easymock.EasyMock;

import cn.osxm.ssmi.com.User;
import cn.osxm.ssmi.com.UserDao;
import cn.osxm.ssmi.com.UserServiceImpl;

/**
 * @ClassName: EasyMockDemo
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class EasyMockDemo {
	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 */

	public static void main(String[] args) {
		// 1、使用接口创建mock对象，
		UserDao userDao = EasyMock.createMock(UserDao.class);
		// 2、设定参预期和返回
		EasyMock.expect(userDao.getUserById("001")).andReturn(new User("Oscar"));
		// 3、结束录制
		EasyMock.replay(userDao);

		UserServiceImpl userService = new UserServiceImpl();
		// UserDao userDao = new UserDaoStub();
		userService.setUserDao(userDao);
		userService.getUserById("001");

		// 3、回放录制
		EasyMock.verify(userDao);
	}
}
