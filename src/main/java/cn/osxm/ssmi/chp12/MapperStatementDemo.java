/**
 * @Title: MapperStatementDemo.java
 * @Package cn.osxm.ssmi.chp12
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��2��25�� ����7:05:29
 * @version V1.0
 */

package cn.osxm.ssmi.chp12;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import cn.osxm.ssmi.com.User;
/**
  * @ClassName: MapperStatementDemo
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class MapperStatementDemo {

	/**
	  * @Title: main
	  * @Description: TODO
	  * @param args
	  */

	   public static void main(String[] args) throws Exception {
	        String resource = "cn/osxm/ssmi/chp12/mybatis-config.xml";
	        InputStream inputStream = Resources.getResourceAsStream(resource);
	        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	        // �ֶ��ύ����
	        SqlSession session = sqlSessionFactory.openSession();
	        try {
	            UserMapper mapper = session.getMapper(UserMapper.class);
	            // 1. ����
	            User user = new User();
	            user.setName("User3");
	            user.setDeptId(3);
	            int affectedRowNumber = mapper.insertUser(user);
	            // �ύ����
	            session.commit();
	            System.out.println("Ӱ���������" + affectedRowNumber);
	        } finally {
	            session.close();
	        }

	    }


}
