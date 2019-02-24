/**
 * @Title: ParameterTypeDemo.java
 * @Package cn.osxm.ssmi.chp12
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年2月25日 上午7:06:16
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
  * @ClassName: ParameterTypeDemo
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class ParameterTypeDemo {

	/**
	  * @Title: main
	  * @Description: TODO
	  * @param args
	  */

	   public static void main(String[] args) throws Exception {
	        String resource = "cn/osxm/ssmi/chp12/mybatis-config.xml";
	        InputStream inputStream = Resources.getResourceAsStream(resource);
	        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	        SqlSession session = sqlSessionFactory.openSession();
	        
	        try {
	            UserMapper mapper = session.getMapper(UserMapper.class);
	            User user = mapper.selectUserOneSimpleParam("User3");
	            System.out.println(user.getName());
	            
	            //不行
	            user = mapper.selectUserMoreSimpleParam(20,"User3");
	            
	            
	        }finally {
	            session.close();
	        }
	    }


}
