/**
 * @Title: UserService2.java
 * @Package cn.osxm.ssmi.chp2
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018年12月9日 上午10:08:23
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
	private UserDao2 userDao2;
	
	public UserService2(UserDao2 userDao2) {
		this.userDao2 = userDao2;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	

	public void add(String userName) {
		User user = new User();
		user.setName(userName);
		userDao.add(user);
		userDao2.add(user);
		
	}
}
