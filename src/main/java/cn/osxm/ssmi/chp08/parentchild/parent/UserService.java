/**
 * @Title: UserService.java
 * @Package cn.osxm.ssmi.chp08.parentchild.parent
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月18日 下午10:21:22
 * @version V1.0
 */

package cn.osxm.ssmi.chp08.parentchild.parent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
  * @ClassName: UserService
  * @Description: TODO
  * @author osxm:oscarxueming
  */

@Service
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
