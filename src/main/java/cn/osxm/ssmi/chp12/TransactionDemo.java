/**
 * @Title: TransactionDemo.java
 * @Package cn.osxm.ssmi.chp12
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��2��25�� ����7:07:49
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
	        //1. �ֶ��ύ����
	        SqlSession session = sqlSessionFactory.openSession();
	        try {
	            //ִ�����
	            session.commit();
	        }finally {
	            session.close();
	        }
	        
	        //2. �Զ��ύ
	        SqlSession autoCommitSession = sqlSessionFactory.openSession(true);
	        try {
	            //ִ�����
	        }finally {
	            autoCommitSession.close();
	        }
	    }

}
