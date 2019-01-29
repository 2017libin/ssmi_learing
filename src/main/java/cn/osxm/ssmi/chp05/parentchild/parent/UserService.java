/**
 * @Title: UserService.java
 * @Package cn.osxm.ssmi.chp5.parentchild.parent
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月30日 上午5:05:47
 * @version V1.0
 */

package cn.osxm.ssmi.chp05.parentchild.parent;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName: UserService
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class UserService {
	@Autowired
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public String get() {
		return userDao.getUserName("");
	}
}
