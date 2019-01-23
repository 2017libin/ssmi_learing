/**
 * @Title: SpringUnitTest.java
 * @Package cn.osxm.ssmi.chp6.springunit
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��1��14�� ����9:45:23
 * @version V1.0
 */

package cn.osxm.ssmi.chp6.springunit;

import static org.junit.Assert.assertTrue;

import org.easymock.EasyMock;
import org.junit.Test;
import org.springframework.test.util.ReflectionTestUtils;

import cn.osxm.ssmi.com.UserDao;
import cn.osxm.ssmi.com.UserService;
import cn.osxm.ssmi.com.UserServiceImpl;

/**
 * @ClassName: SpringUnitTest
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class SpringUnitTest {
	@Test
	public void testGetUserById() {
		UserService userService = new UserServiceImpl();
		// 1. ����Mock����
		UserDao userDao = EasyMock.mock(UserDao.class);
		// 2.�趨 Mock �����Ԥ����Ϊ�����
		EasyMock.expect(userDao.getUserNameById("1")).andReturn("oscar");
		// 3¼��Mock�������Ϊ.
		EasyMock.replay(userDao);

		// 4.ʹ��Spring�������Ժͷ�������
		ReflectionTestUtils.setField(userService, "userDao", userDao);
		String userName = userService.getUserNameById("1");
		assertTrue(userName.equals("oscar"));

		// 5.�� Mock �������Ϊ������֤���Ƿ�Ԥ��ʹ��Mock
		EasyMock.verify(userDao);

	}

}
