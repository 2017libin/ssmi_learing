/**
 * @Title: MyBatisLogTest.java
 * @Package cn.osxm.ssmi.chp15.log
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年7月13日 下午12:11:36
 * @version V1.0
 */

package cn.osxm.ssmi.chp15.log;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Map;

import org.apache.ibatis.cache.Cache;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import cn.osxm.ssmi.chp15.UserMapper;


/**
 * @ClassName: MyBatisLogTest
 * @Description: TODO
 * @author oscarchen
 */

public class MyBatisLogTest {
	private static SqlSessionFactory sqlSessionFactory;

    private static SqlSession session;

    private static SqlSession session1;

    private static SqlSession session2;

    @BeforeClass
    public static void setUp() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        session = sqlSessionFactory.openSession();

        session1 = sqlSessionFactory.openSession();
        session2 = sqlSessionFactory.openSession();
    }

    // @Test
    public void level1Cache() {
        UserMapper mapper = session.getMapper(UserMapper.class);
        System.out.println("第一次查询");
        Map map = mapper.selectUser(1);
        System.out.println("第一次查询结果" + map.toString());
        session.clearCache();
        System.out.println("第二次查询");
        map = mapper.selectUser(1);
        System.out.println("第二次查询结果" + map.toString());
    }

    // @Test
    public void logLevel() {
        org.apache.ibatis.logging.LogFactory.useLog4JLogging();
        UserMapper mapper = session.getMapper(UserMapper.class);
        System.out.println("方法1查询");
        Map map = mapper.selectUser(1);
        session.clearCache();
        System.out.println("方法2查询");
        map = mapper.selectUser(1);

    }

    @Test
    public void level2Cache() {
        UserMapper mapper = session1.getMapper(UserMapper.class);
        System.out.println("第一次查询");
        Map<String, String> map = mapper.selectUser(1);
        System.out.println("第一次查询结果" + map.toString());
        // 关闭之后才写入二级缓存
        session1.close();

        mapper = session2.getMapper(UserMapper.class);
        System.out.println("第二次不同Session相同的查询");
        map = mapper.selectUser(1);
        System.out.println("第二次不同Session相同的查询结果" + map.toString());
    }

    // @Test
    public void addlog() {
        org.apache.ibatis.logging.Log logger = org.apache.ibatis.logging.LogFactory.getLog("cn.osxm.ssmi.chp13");
        logger.debug("This is MyBatis Log Test");
    }

    @AfterClass
    public static void tearDown() {
        session.close();
    }
}
