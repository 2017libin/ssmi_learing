/**
 * @Title: TransactionDemo.java
 * @Package cn.osxm.ssmi.chp12
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年2月25日 上午7:07:49
 * @version V1.0
 */

package cn.osxm.ssmi.chp12;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
/**
  * @ClassName: TransactionDemo
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class TransactionDemo {

	/**
	  * @Title: main
	  * @Description: TODO
	  * @param args
	  */

	   public static void main(String[] args) throws Exception {
	        String resource = "cn/osxm/ssmi/chp12/mybatis-config.xml";
	        InputStream inputStream = Resources.getResourceAsStream(resource);
	        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	        //1. 手动提交事务
	        SqlSession session = sqlSessionFactory.openSession();
	        try {
	            //执行语句
	            session.commit();
	        }finally {
	            session.close();
	        }
	        
	        //2. 自动提交
	        SqlSession autoCommitSession = sqlSessionFactory.openSession(true);
	        try {
	            //执行语句
	        }finally {
	            autoCommitSession.close();
	        }
	    }

}
