/**
 * @Title: AnnoMapperTests.java
 * @Package cn.osxm.ssmi.chp13
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年7月4日 下午11:16:57
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

import cn.osxm.ssmi.com.User;
/**
  * @ClassName: AnnoMapperTests
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class AnnoMapperTests {
    private static SqlSession session;

    @BeforeClass
    public static void setUp() throws IOException {
        String resource = "cn/osxm/ssmi/chp13/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        session = sqlSessionFactory.openSession();
    }

   // @Test
    public void annoMapperQuery() {
        UserAnnoMapper annoMapper = session.getMapper(UserAnnoMapper.class);
        User user= annoMapper.selectUser(1);
        System.out.println(user.getName());               
    }
    
    @Test
    public void annoMapperProviderQuery() {
        UserAnnoMapper annoMapper = session.getMapper(UserAnnoMapper.class);
        User user= annoMapper.selectUserByProvider(1);
        System.out.println(user.getName());               
    }

    @AfterClass
    public static void tearDown() {
        session.close();
    }

}
