/**
 * @Title: SpringDAOTests.java
 * @Package cn.osxm.ssmi.chp14
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年7月6日 下午1:18:41
 * @version V1.0
 */

package cn.osxm.ssmi.chp14;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import cn.osxm.ssmi.com.User;

/**
 * @ClassName: SpringDAOTests
 * @Description: TODO
 * @author osxm:oscarxueming
 */

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:cn/osxm/ssmi/chp14/spring-dbaccess.xml")
public class SpringDAOTests {

	@Autowired
	private UserDao userDaoSupport;

	@Autowired
	private UserDao userDao;

	@Autowired
	private UserDao userDaoHibernateSupport;

	// @Test
	public void jdbcDao() {
		User user = userDao.get(1);
		System.out.println(user.getName());
	}

	// @Test
	public void jdbcDaoSupport() {
		User user = userDaoSupport.get(1);
		System.out.println(user.getName());
	}

	@Test
	public void hibernateDaoSupport() {
		User user = userDaoHibernateSupport.get(1);
		System.out.println(user.getName());
	}

}
