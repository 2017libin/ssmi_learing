/**
 * @Title: MyBatisLogTest.java
 * @Package cn.osxm.ssmi.chp15.log
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年7月13日 下午12:11:36
 * @version V1.0
 */

package cn.osxm.ssmi.chp15.log;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Map;

import org.apache.ibatis.cache.Cache;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import cn.osxm.ssmi.chp12.UserMapper;

/**
 * @ClassName: MyBatisLogTest
 * @Description: TODO
 * @author oscarchen
 */

public class MyBatisLogTest {
	private static SqlSession session;

	@BeforeClass
	public static void setUp() throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		session = sqlSessionFactory.openSession();
	}

	/*
	 * @Test public void level1Cache() { UserMapper mapper =
	 * session.getMapper(UserMapper.class); System.out.println("第一次查询"); Map map =
	 * mapper.selectUser(1); System.out.println("第一次查询结果"+map.toString());
	 * session.clearCache(); System.out.println("第二次查询"); map =
	 * mapper.selectUser(1); System.out.println("第二次查询结果"+map.toString()); }
	 */

	@AfterClass
	public static void tearDown() {
		session.close();
	}
}
