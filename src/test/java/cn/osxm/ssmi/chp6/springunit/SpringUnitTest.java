/**
 * @Title: SpringUnitTest.java
 * @Package cn.osxm.ssmi.chp6.springunit
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月14日 下午9:45:23
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
		// 1. 创建Mock对象
		UserDao userDao = EasyMock.mock(UserDao.class);
		// 2.设定 Mock 对象的预期行为和输出
		EasyMock.expect(userDao.getUserNameById("1")).andReturn("oscar");
		// 3录制Mock对象的行为.
		EasyMock.replay(userDao);

		// 4.使用Spring设置属性和方法调用
		ReflectionTestUtils.setField(userService, "userDao", userDao);
		String userName = userService.getUserNameById("1");
		assertTrue(userName.equals("oscar"));

		// 5.对 Mock 对象的行为进行验证，是否按预期使用Mock
		EasyMock.verify(userDao);

	}

}
