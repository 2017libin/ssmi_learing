/**
 * @Title: ResultTypeMapDemo.java
 * @Package cn.osxm.ssmi.chp12
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��3��1�� ����9:44:05
 * @version V1.0
 */

package cn.osxm.ssmi.chp12;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import cn.osxm.ssmi.com.User;

/**
 * @ClassName: ResultTypeMapDemo
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class ResultTypeMapDemo {

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 * @throws IOException 
	 */

	public static void main(String[] args) throws IOException {

		String resource = "cn/osxm/ssmi/chp12/mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = sqlSessionFactory.openSession();

		try {

			UserMapper mapper = session.getMapper(UserMapper.class);
			// 1.����POJO����
			User user = mapper.selectUserOneSimpleParam("user2");
			// 2.����List����
			List<User> list = mapper.selectUserList("user1");
			System.out.println(list.get(0).toString());

			// 3.����Map����
			Map map = mapper.selectUserResultMap("user2");
			System.out.println(map.toString());

			// 4.�ֶ�ӳ��
			// user = mapper.selectUserDetail("1");
			// System.out.println(user.toString());
		} finally {
			session.close();
		}

	}

}
