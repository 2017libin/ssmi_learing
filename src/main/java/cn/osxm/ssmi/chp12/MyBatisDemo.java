package cn.osxm.ssmi.chp12;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import cn.osxm.ssmi.com.User;

public class MyBatisDemo {

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 * @throws Exception
	 */

	public static void main(String[] args) throws Exception {
		// 1.根据XML配置构建 SqlSessionFactory
		String resource = "cn/osxm/ssmi/chp12/mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// 2.从SqlSessionFactory打开一个SqlSession
		SqlSession session = sqlSessionFactory.openSession();
		// 3.执行DB操作并关闭Session
		try {
			// 3.1 使用XML配置
			User user = (User) session.selectOne("cn.osxm.ssmi.chp12.UserMapper.selectUser", 1);
			System.out.println(user.getName());

			// 3.2 使用接口
			UserMapper mapper = session.getMapper(UserMapper.class);
			User user2 = mapper.selectUser("1");
			System.out.println(user2.getName());
			
			User user3 = mapper.findUserByName("Chen");
			System.out.println(user2.getName());
		} finally {
			session.close();
		}

	}

}
