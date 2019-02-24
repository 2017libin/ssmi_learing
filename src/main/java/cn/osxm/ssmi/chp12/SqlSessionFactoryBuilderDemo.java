/**
 * @Title: SqlSessionFactoryBuilderDemo.java
 * @Package cn.osxm.ssmi.chp12
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��2��23�� ����12:20:21
 * @version V1.0
 */

package cn.osxm.ssmi.chp12;
/**
  * @ClassName: SqlSessionFactoryBuilderDemo
  * @Description: TODO
  * @author osxm:oscarxueming
  */
import java.io.InputStream;
import java.util.Properties;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import cn.osxm.ssmi.com.User;
public class SqlSessionFactoryBuilderDemo {

	/**
	  * @Title: main
	  * @Description: TODO
	  * @param args
	  */

	 public static void main(String[] args)  throws Exception{
	        
	        String resource = "cn/osxm/ssmi/chp12/mybatis-config.xml";
	        InputStream inputStream = Resources.getResourceAsStream(resource);
	        // ��ʽ1.�����������ļ�����SqlSessionFactory,ʹ��default�Ļ���
	        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	        
	        //��ʽ12.�����ļ�+����
	        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream,"development");
	        
	        //��ʽ3.�����ļ�+����+��������
	        Properties properties = new Properties();
	        properties.setProperty("driver", "com.mysql.cj.jdbc.Driver");
	        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream,"development",properties);
	        
	        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream,properties);

	        SqlSession session = sqlSessionFactory.openSession();
	        try {
	            UserMapper mapper = session.getMapper(UserMapper.class);
	            User user2 = mapper.selectUser("1");
	            System.out.println(user2.getName());
	        } finally {
	            session.close();
	        }

	    }

}
