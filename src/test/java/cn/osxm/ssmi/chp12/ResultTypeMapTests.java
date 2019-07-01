/**
 * @Title: ResultTypeMapTests.java
 * @Package cn.osxm.ssmi.chp12
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年7月1日 下午8:31:47
 * @version V1.0
 */

package cn.osxm.ssmi.chp12;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import cn.osxm.ssmi.com.User;
/**
  * @ClassName: ResultTypeMapTests
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class ResultTypeMapTests {
	 private static SqlSession session;
	    
	    @BeforeClass
	    public static void setUp() throws IOException {
	        String resource = "cn/osxm/ssmi/chp12/mybatis-config.xml";
	        InputStream inputStream = Resources.getResourceAsStream(resource);
	        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	        session = sqlSessionFactory.openSession();
	    }
	    
	    @Test
	    public void resultMap() {
	        UserMapper mapper = session.getMapper(UserMapper.class);
	        List<User> userList = mapper.selectUserDetail("1");
	        System.out.println(userList.get(0).getEmail());
	        System.out.println(userList.get(0).getId());
	        System.out.println(userList.get(0).getName());
	    }

}
