/**
 * @Title: UserService.java
 * @Package cn.osxm.ssmi.chp2
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018��12��9�� ����7:25:34
 * @version V1.0
 */

package cn.osxm.ssmi.chp2;

import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName: UserService
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class UserService {
	private UserDao userDao;

	public UserService(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void add(String userName) {
		User user = new User();
		user.setName(userName);
		userDao.add(user);
	}
	
    @Transactional
    public void update(User user) {
        System.out.println("Update User");
    }
}
