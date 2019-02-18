/**
 * @Title: DynamicSqlDemo.java
 * @Package cn.osxm.ssmi.chp13
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��2��18�� ����9:13:32
 * @version V1.0
 */

package cn.osxm.ssmi.chp13;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import cn.osxm.ssmi.com.User;
/**
  * @ClassName: DynamicSqlDemo
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class DynamicSqlDemo {

	/**
	  * @Title: main
	  * @Description: TODO
	  * @param args
	  */

	   public static void main(String[] args) throws Exception {
	        // 1.����XML���ù��� SqlSessionFactory
	        String resource = "cn/osxm/ssmi/chp13/mybatis-config.xml";
	        InputStream inputStream = Resources.getResourceAsStream(resource);
	        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	        // 2.��SqlSessionFactory��һ��SqlSession
	        SqlSession session = sqlSessionFactory.openSession();
	        // 3.ִ��DB�������ر�Session
	        try {
	            
	          
	            UserMapper mapper = session.getMapper(UserMapper.class);
	            System.out.println("begin:if��ʹ��");
	            List<User> list = mapper.findUserListWithNameIf("Chen ");
	            for(User user:list) {
	                System.out.println(user.getName());
	            }
	            System.out.println("end:if��ʹ��");
	            
	            System.out.println("begin:choose��ʹ��");
	            list = mapper.findUserListWithChoose(null,1);
	            for(User user:list) {
	                System.out.println(user.getName());
	            }
	            System.out.println("end:choose��ʹ��");
	        } finally {
	            session.close();
	        }

	    }

}
