/**
 * @Title: LoggerTests.java
 * @Package cn.osxm.ssmi.chp13
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年7月3日 下午8:50:40
 * @version V1.0
 */

package cn.osxm.ssmi.chp13;
import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.osxm.ssmi.com.User;
/**
  * @ClassName: LoggerTests
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class LoggerTests {
	 private static SqlSession session;
	    
	    @BeforeClass
	    public static void setUp() throws IOException {
	        String resource = "cn/osxm/ssmi/chp13/mybatis-config.xml";
	        InputStream inputStream = Resources.getResourceAsStream(resource);
	        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	        session = sqlSessionFactory.openSession();
	    }

	    //@Test
	    public void slf4Log() {
	       Logger logger = LoggerFactory.getLogger("cn.osxm.ssmi.chp13");
	       logger.debug("This is Slf4 Log Test");
	    }
	    
	    //@Test
	    public void myBatisLog() {
	        org.apache.ibatis.logging.Log logger = org.apache.ibatis.logging.LogFactory.getLog("cn.osxm.ssmi.chp13");
	        logger.debug("This is MyBatis Log Test");
	    }
	    
	    
	    @Test
	    public void mybatisLog() {
	        UserMapper mapper = session.getMapper(UserMapper.class);
	        User user = mapper.selectUser(1);
	        System.out.println(user.getCountry());
	        user = mapper.selectUser(1);
	    }
	    @AfterClass
	    public static void tearDown() {        
	        session.close();
	    }
}
