/**
 * @Title: AutoIncrementKeyTests.java
 * @Package cn.osxm.ssmi.chp13
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年7月5日 下午6:01:37
 * @version V1.0
 */

package cn.osxm.ssmi.chp13;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import cn.osxm.ssmi.com.User;

/**
 * @ClassName: AutoIncrementKeyTests
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class AutoIncrementKeyTests {
	private static SqlSession session;

	// @Test
	public void insertUserMySql() throws IOException {
		String resource = "cn/osxm/ssmi/chp13/mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		session = sqlSessionFactory.openSession();

		UserMapper mapper = session.getMapper(UserMapper.class);
		User user = new User();
		user.setName("Zhang San");
		user.setAge(30);
		mapper.insertUser(user);
		session.commit();
		session.close();
	}

	@Test
	public void insertUserOralce() throws IOException {
		String resource = "cn/osxm/ssmi/chp13/mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream, "my_oracle");
		session = sqlSessionFactory.openSession();

		UserMapper mapper = session.getMapper(UserMapper.class);
		User user = new User();
		user.setName("Zhang San");
		user.setAge(30);
		mapper.insertUserOracle(user);
		session.commit();
	}
}
