/**
 * @Title: InsertUpdateDeleteTest.java
 * @Package cn.osxm.ssmi.chp12
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��3��1�� ����9:32:05
 * @version V1.0
 */

package cn.osxm.ssmi.chp12;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import cn.osxm.ssmi.com.User;
/**
  * @ClassName: InsertUpdateDeleteTest
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class InsertUpdateDeleteTest {
	private static SqlSession session;

    @BeforeClass
    public static void setUp() throws IOException {
        String resource = "cn/osxm/ssmi/chp12/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        session = sqlSessionFactory.openSession();
    }

    //@Test
    public void insertUser() {
        InsertUpdateDeleteMapper mapper = session.getMapper(InsertUpdateDeleteMapper.class);
        User user  = new User();
        user.setName("user5");
        user.setDeptId(1);
        int affectedRows = mapper.insertUser(user);
        session.commit();
        System.out.println("insertUser Ӱ��������"+affectedRows);
        System.out.println("user������Զ�����id��"+user.getId());
    }
    
    //@Test
    public void updateUser() {
        InsertUpdateDeleteMapper mapper = session.getMapper(InsertUpdateDeleteMapper.class);
        User user  = new User();
        user.setId(7);
        user.setName("user7");
        int affectedRows = mapper.updateUser(user);
        session.commit();
        System.out.println("updateUser Ӱ��������"+affectedRows);
    }
    
    //@Test
    public void deleteUser() {
        InsertUpdateDeleteMapper mapper = session.getMapper(InsertUpdateDeleteMapper.class);
        User user  = new User();
        user.setId(9);
        int affectedRows = mapper.deleteUser(user);
        session.commit();
        System.out.println("deleteUser Ӱ��������"+affectedRows);
    }
    
    @Test
    public void selectUserWithSqlElement() {
        InsertUpdateDeleteMapper mapper = session.getMapper(InsertUpdateDeleteMapper.class);
        Map userMap = mapper.selectUserWithSqlElement(1);
        System.out.println("selectUserWithSqlElement:"+userMap.toString());
    }
    
    @Test
    public void selectUserWithSqlElementParams() {
        InsertUpdateDeleteMapper mapper = session.getMapper(InsertUpdateDeleteMapper.class);
        Map userMap = mapper.selectUserWithSqlElementParams(1);
        System.out.println("selectUserWithSqlElementParams:"+userMap.toString());
    }
    
    @AfterClass
    public static void tearDown() {
        session.close();
    }
}
