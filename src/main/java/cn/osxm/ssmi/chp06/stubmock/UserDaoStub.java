/**
 * @Title: UserDaoStub.java
 * @Package cn.osxm.ssmi.chp6.stubmock
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月14日 下午10:00:17
 * @version V1.0
 */

package cn.osxm.ssmi.chp06.stubmock;

import cn.osxm.ssmi.com.User;
import cn.osxm.ssmi.com.UserDao;

/**
 * @ClassName: UserDaoStub
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class UserDaoStub implements UserDao {

	@Override
	public User getUserById(String id) {

		User user = new User("");
		return user;
	}

	@Override
	public String getUserNameById(String id) {
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByName(String name) {
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(User user) {
		
		// TODO Auto-generated method stub
		
	}

}
