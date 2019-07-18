/**
 * @Title: SqlSessionManagerTest.java
 * @Package cn.osxm.ssmi.chp13
 * @Description: TODO
 * @author oscarchen
 * @date 2019Äê7ÔÂ18ÈÕ
 * @version V1.0
 */
package cn.osxm.ssmi.chp13;
import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.SqlSessionManager;
import org.junit.BeforeClass;
import org.junit.Test;

import cn.osxm.ssmi.com.User;

/**
  * @ClassName: SqlSessionManagerTest
  * @Description: TODO
  * @author oscarchen
  */
public class SqlSessionManagerTest {
private static SqlSession session;
    
    private static  SqlSessionManager sqlSessionManager;

    @BeforeClass
    public static void setUp() throws IOException {
        String resource = "cn/osxm/ssmi/chp13/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
         sqlSessionManager =  SqlSessionManager.newInstance(inputStream);
        
    }

   @Test
    public void annoMapperQuery() {
        UserAnnoMapper annoMapper = sqlSessionManager.getMapper(UserAnnoMapper.class);
        User user= annoMapper.selectUser(1);
        System.out.println(user.getName());               
    }
}
