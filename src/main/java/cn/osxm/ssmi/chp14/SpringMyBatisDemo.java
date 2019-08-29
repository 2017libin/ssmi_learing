/**
 * @Title: SpringMyBatisDemo.java
 * @Package cn.osxm.ssmi.chp14
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年3月10日 下午2:35:52
 * @version V1.0
 */

package cn.osxm.ssmi.chp14;

import org.apache.ibatis.session.SqlSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.osxm.ssmi.com.User;

/**
 * @ClassName: SpringMyBatisDemo
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class SpringMyBatisDemo {

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 */

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 */

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml", SpringMyBatisDemo.class);
		// 1.方式1-映射器
		UserMapper userMapper = (UserMapper) context.getBean("userMapper");
		System.out.println(userMapper.getUser("1"));

		// 2.方式2-SqlSession
		SqlSession sqlSession = (SqlSession) context.getBean("sqlSession");
		User user = sqlSession.selectOne("cn.osxm.ssmi.chp14.UserMapper.getUser", "1");
		System.out.println(user);
		// 3.方式3-SqlSessionDaoSupport
		UserDaoMyBatisImpl userDao = (UserDaoMyBatisImpl) context.getBean("userDao");
		user = userDao.getUser("1");
		System.out.println(user);

	}

}
