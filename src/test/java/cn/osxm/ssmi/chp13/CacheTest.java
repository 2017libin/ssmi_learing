/**
 * @Title: CacheTest.java
 * @Package cn.osxm.ssmi.chp13
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��3��1�� ����9:33:55
 * @version V1.0
 */

package cn.osxm.ssmi.chp13;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import cn.osxm.ssmi.com.User;

/**
 * @ClassName: CacheTest
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class CacheTest {
	private static SqlSession session1;

	private static SqlSession session2;

	@BeforeClass
	public static void setUp() throws IOException {
		String resource = "cn/osxm/ssmi/chp13/mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		session1 = sqlSessionFactory.openSession();
		session2 = sqlSessionFactory.openSession();
	}

	// @Test
	public void level1SameMethodSameParem() {
		UserMapper mapper = session1.getMapper(UserMapper.class);
		System.out.println("��һ�β�ѯ");
		Map<String, String> map = mapper.selectUserMap(1);
		System.out.println("��һ�β�ѯ���" + map.toString());
		System.out.println("�ڶ��β�ѯ");
		map = mapper.selectUserMap(1);
		System.out.println("�ڶ��β�ѯ���" + map.toString());
		System.out.println("������棺 session.clearCache();");
		session1.clearCache();
		System.out.println("�����β�ѯ");
		map = mapper.selectUserMap(1);
		System.out.println("�����β�ѯ���" + map.toString());
	}

	// @Test
	public void level1SameMethodDiffParem() {
		UserMapper mapper = session1.getMapper(UserMapper.class);
		System.out.println("��һ�β�ѯ");
		Map<String, String> map = mapper.selectUserMap(1);
		System.out.println("��һ�β�ѯ���" + map.toString());
		System.out.println("�ڶ��β�ѯ");
		map = mapper.selectUserMap(2);
		System.out.println("�ڶ��β�ѯ���" + map.toString());
		System.out.println("������棺 session.clearCache();");
		session1.clearCache();
		System.out.println("�����β�ѯ");
		map = mapper.selectUserMap(1);
		System.out.println("�����β�ѯ���" + map.toString());
	}

	@Test
	public void level2SameMethodDiffParem1() {
		UserMapper mapper = session1.getMapper(UserMapper.class);
		System.out.println("��һ�β�ѯ");
		Map<String, String> map = mapper.selectUserMap(1);
		System.out.println("��һ�β�ѯ���" + map.toString());
		// �ر�֮���д���������
		session1.close();

		mapper = session2.getMapper(UserMapper.class);
		System.out.println("��ͬSession��ͬ��ѯ");
		map = mapper.selectUserMap(1);
		System.out.println("��ͬSession��ͬ��ѯ" + map.toString());
	}

	// @Test
	public void level2SameMethodDiffParem() {
		UserMapper mapper = session1.getMapper(UserMapper.class);
		System.out.println("��һ�β�ѯ");
		User user = mapper.selectUser(1);
		System.out.println("��һ�β�ѯ���" + user.toString());
		// �ر�֮���д���������
		session1.close();

		mapper = session2.getMapper(UserMapper.class);
		System.out.println("��ͬSession��ͬ��ѯ");
		user = mapper.selectUser(1);
		System.out.println("��ͬSession��ͬ��ѯ" + user.toString());
	}

	@AfterClass
	public static void tearDown() {
		session1.close();
		session2.close();
	}
}
