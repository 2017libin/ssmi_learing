/**
 * @Title: UserDaoJPAImpl.java
 * @Package cn.osxm.ssmi.chp14
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年7月11日 下午6:13:14
 * @version V1.0
 */

package cn.osxm.ssmi.chp14;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import cn.osxm.ssmi.com.User;

/**
 * @ClassName: UserDaoJPAImpl
 * @Description: TODO
 * @author osxm:oscarxueming
 */

@Repository(value = "jpaUserDao")
public class UserDaoJPAImpl implements UserDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public User get(int id) {
		Object user = em.find(User.class, 1);
		User user1 = (User) user;
		return user1;
	}

	/*
	 * @Override public void add(User user) { // TODO Auto-generated method stub
	 * 
	 * }
	 */

}
