/**
 * @Title: UserDaoHibernateDaoSupportImpl.java
 * @Package cn.osxm.ssmi.chp14
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年7月6日 下午1:23:34
 * @version V1.0
 */

package cn.osxm.ssmi.chp14;

import org.hibernate.Session;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import cn.osxm.ssmi.com.User;

/**
 * @ClassName: UserDaoHibernateDaoSupportImpl
 * @Description: TODO
 * @author osxm:oscarxueming
 */
public class UserDaoHibernateDaoSupportImpl extends HibernateDaoSupport implements UserDao {

	@Override
	public User get(int id) {
		Session session = this.getSessionFactory().openSession();
		User user = session.get(User.class, 1);
		return user;
	}

}