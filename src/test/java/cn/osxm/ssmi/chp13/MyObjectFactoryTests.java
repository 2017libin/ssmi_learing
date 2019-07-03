/**
 * @Title: MyObjectFactoryTests.java
 * @Package cn.osxm.ssmi.chp13
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年7月3日 下午8:53:28
 * @version V1.0
 */

package cn.osxm.ssmi.chp13;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import cn.osxm.ssmi.com.User;

/**
 * @ClassName: MyObjectFactoryTests
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class MyObjectFactoryTests {
	private static SqlSession session;

	@BeforeClass
	public static void setUp() throws IOException {
		String resource = "cn/osxm/ssmi/chp13/mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		session = sqlSessionFactory.openSession();
	}

	@Test
	public void myObjectFactoryTests() {
		UserMapper mapper = session.getMapper(UserMapper.class);
		User user = mapper.selectUser(1);
		System.out.println(user.getCountry());
	}

	@AfterClass
	public static void tearDown() {
		session.close();
	}
}
