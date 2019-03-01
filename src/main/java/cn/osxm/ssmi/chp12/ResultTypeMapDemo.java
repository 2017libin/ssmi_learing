/**
 * @Title: ResultTypeMapDemo.java
 * @Package cn.osxm.ssmi.chp12
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年3月1日 下午9:44:05
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
			// 1.返回POJO类型
			User user = mapper.selectUserOneSimpleParam("user2");
			// 2.返回List类型
			List<User> list = mapper.selectUserList("user1");
			System.out.println(list.get(0).toString());

			// 3.返回Map类型
			Map map = mapper.selectUserResultMap("user2");
			System.out.println(map.toString());

			// 4.手动映射
			// user = mapper.selectUserDetail("1");
			// System.out.println(user.toString());
		} finally {
			session.close();
		}

	}

}
