/**
 * @Title: EasyMockDemo.java
 * @Package cn.osxm.ssmi.chp6.stubmock
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��1��14�� ����9:50:37
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
		// 1��ʹ�ýӿڴ���mock����
		UserDao userDao = EasyMock.createMock(UserDao.class);
		// 2���趨��Ԥ�ںͷ���
		EasyMock.expect(userDao.getUserById("001")).andReturn(new User("Oscar"));
		// 3������¼��
		EasyMock.replay(userDao);

		UserServiceImpl userService = new UserServiceImpl();
		// UserDao userDao = new UserDaoStub();
		userService.setUserDao(userDao);
		userService.getUserById("001");

		// 3���ط�¼��
		EasyMock.verify(userDao);
	}
}
