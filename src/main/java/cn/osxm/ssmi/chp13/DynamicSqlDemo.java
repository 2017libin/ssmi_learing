/**
 * @Title: DynamicSqlDemo.java
 * @Package cn.osxm.ssmi.chp13
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年2月18日 下午9:13:32
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
	        // 1.根据XML配置构建 SqlSessionFactory
	        String resource = "cn/osxm/ssmi/chp13/mybatis-config.xml";
	        InputStream inputStream = Resources.getResourceAsStream(resource);
	        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	        // 2.从SqlSessionFactory打开一个SqlSession
	        SqlSession session = sqlSessionFactory.openSession();
	        // 3.执行DB操作并关闭Session
	        try {
	            
	          
	            UserMapper mapper = session.getMapper(UserMapper.class);
	            System.out.println("begin:if的使用");
	            List<User> list = mapper.findUserListWithNameIf("Chen ");
	            for(User user:list) {
	                System.out.println(user.getName());
	            }
	            System.out.println("end:if的使用");
	            
	            System.out.println("begin:choose的使用");
	            list = mapper.findUserListWithChoose(null,1);
	            for(User user:list) {
	                System.out.println(user.getName());
	            }
	            System.out.println("end:choose的使用");
	        } finally {
	            session.close();
	        }

	    }

}
