/**
 * @Title: DatabaseIdProviderTest.java
 * @Package cn.osxm.ssmi.chp13
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年3月1日 下午9:34:34
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
/**
  * @ClassName: DatabaseIdProviderTest
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class DatabaseIdProviderTest {
	private static SqlSession session;

    @BeforeClass
    public static void setUp() throws IOException {
        String resource = "cn/osxm/ssmi/chp13/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        session = sqlSessionFactory.openSession();
    }

    @Test
    public void databaseIdProviderUse() {
        DemoMapper mapper = session.getMapper(DemoMapper.class);
       String sysTime = mapper.SelectSystemTime();
       System.out.println(sysTime);
    }

    @AfterClass
    public static void tearDown() {
        session.close();
    }
}
