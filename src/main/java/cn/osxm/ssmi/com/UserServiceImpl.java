/**
 * @Title: UserServiceImpl.java
 * @Package cn.osxm.ssmi.com
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月14日 下午9:56:30
 * @version V1.0
 */

package cn.osxm.ssmi.com;

/**
 * @ClassName: UserServiceImpl
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class UserServiceImpl implements UserService {

	private UserDao userDao;

	public UserDao getUserDao() {

		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public User getUserById(String id) {

		// TODO Auto-generated method stub
		return null;
	}

	public String getUserNameById(String id) {
		return null;
	}

}
