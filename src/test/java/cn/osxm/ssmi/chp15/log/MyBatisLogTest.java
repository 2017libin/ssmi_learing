/**
 * @Title: MyBatisLogTest.java
 * @Package cn.osxm.ssmi.chp15.log
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��7��13�� ����12:11:36
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
	 * session.getMapper(UserMapper.class); System.out.println("��һ�β�ѯ"); Map map =
	 * mapper.selectUser(1); System.out.println("��һ�β�ѯ���"+map.toString());
	 * session.clearCache(); System.out.println("�ڶ��β�ѯ"); map =
	 * mapper.selectUser(1); System.out.println("�ڶ��β�ѯ���"+map.toString()); }
	 */

	@AfterClass
	public static void tearDown() {
		session.close();
	}
}
