/**
 * @Title: ResultMapUsageTest.java
 * @Package cn.osxm.ssmi.chp12
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年3月1日 下午9:32:57
 * @version V1.0
 */

package cn.osxm.ssmi.chp12;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import cn.osxm.ssmi.com.Dept;
/**
  * @ClassName: ResultMapUsageTest
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class ResultMapUsageTest {
	 private static SqlSession session;

	    @BeforeClass
	    public static void setUp() throws IOException {
	        String resource = "cn/osxm/ssmi/chp12/mybatis-config.xml";
	        InputStream inputStream = Resources.getResourceAsStream(resource);
	        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	        session = sqlSessionFactory.openSession();
	    }

	    // 关联-嵌套查询
	    @Test
	    public void selectDeptAssociationSelect() {
	        ResultMapDemoMapper mapper = session.getMapper(ResultMapDemoMapper.class);
	        cn.osxm.ssmi.chp12.entity.Dept dept = mapper.selectDeptAssociationSelect("dept0001");
	        System.out.println("[关联]通过嵌套查询关联：" + dept.getDeptLeader().getUserName());
	    }

	    // 关联-嵌套结果
	    @Test
	    public void selectDeptAssociationRusult() {
	        ResultMapDemoMapper mapper = session.getMapper(ResultMapDemoMapper.class);
	        cn.osxm.ssmi.chp12.entity.Dept dept = mapper.selectDeptAssociationResult("dept0001");
	        System.out.println("[关联]通过嵌套结果关联：" + dept.getDeptLeader().getUserName());
	    }

	    // 集合-嵌套查询
	    @Test
	    public void selectDeptCollectionSelect() {
	        ResultMapDemoMapper mapper = session.getMapper(ResultMapDemoMapper.class);
	        cn.osxm.ssmi.chp12.entity.Dept dept = mapper.selectDeptCollectionSelect("dept0001");
	        System.out.println("[集合]通过嵌套查询关联：" + dept.getDeptUsers().toString());
	    }

	    // 集合-嵌套查询
	    @Test
	    public void selectDeptCollectionResult() {
	        ResultMapDemoMapper mapper = session.getMapper(ResultMapDemoMapper.class);
	        cn.osxm.ssmi.chp12.entity.Dept dept = mapper.selectDeptCollectionSelect("dept0001");
	        System.out.println("[集合]通过嵌套结果关联：" + dept.getDeptUsers().toString());
	    }

	    // @Test
	    @SuppressWarnings("unused")
		public void testSelectDeptCollection() {
	        DeptMapper mapper = session.getMapper(DeptMapper.class);
	        Dept dept = mapper.selectDeptCollection(1);
	        // System.out.println(dept.getDeptUsers().toString());
	    }

	    @Test
	    public void testSelectUserDiscriminator() {
	        ResultMapDemoMapper mapper = session.getMapper(ResultMapDemoMapper.class);
	        cn.osxm.ssmi.chp12.entity.GenUser user = mapper.selectUserDiscriminator(1);
	        System.out.println(user.getClass().getSimpleName());
	        System.out.println(user.toString());
	    }

	    @AfterClass
	    public static void tearDown() {
	        session.close();
	    }
}
