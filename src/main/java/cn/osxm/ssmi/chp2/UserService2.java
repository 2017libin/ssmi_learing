/**
 * @Title: UserService2.java
 * @Package cn.osxm.ssmi.chp2
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018��12��9�� ����10:08:23
 * @version V1.0
 */

package cn.osxm.ssmi.chp2;

/**
 * @ClassName: UserService2
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class UserService2 {
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void add(String userName) {
		User user = new User();
		user.setName(userName);
		userDao.add(user);
	}
}
