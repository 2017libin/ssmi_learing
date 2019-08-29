/**
 * @Title: ResultMapUsageTest.java
 * @Package cn.osxm.ssmi.chp12
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��3��1�� ����9:32:57
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

	    // ����-Ƕ�ײ�ѯ
	    @Test
	    public void selectDeptAssociationSelect() {
	        ResultMapDemoMapper mapper = session.getMapper(ResultMapDemoMapper.class);
	        cn.osxm.ssmi.chp12.entity.Dept dept = mapper.selectDeptAssociationSelect("dept0001");
	        System.out.println("[����]ͨ��Ƕ�ײ�ѯ������" + dept.getDeptLeader().getUserName());
	    }

	    // ����-Ƕ�׽��
	    @Test
	    public void selectDeptAssociationRusult() {
	        ResultMapDemoMapper mapper = session.getMapper(ResultMapDemoMapper.class);
	        cn.osxm.ssmi.chp12.entity.Dept dept = mapper.selectDeptAssociationResult("dept0001");
	        System.out.println("[����]ͨ��Ƕ�׽��������" + dept.getDeptLeader().getUserName());
	    }

	    // ����-Ƕ�ײ�ѯ
	    @Test
	    public void selectDeptCollectionSelect() {
	        ResultMapDemoMapper mapper = session.getMapper(ResultMapDemoMapper.class);
	        cn.osxm.ssmi.chp12.entity.Dept dept = mapper.selectDeptCollectionSelect("dept0001");
	        System.out.println("[����]ͨ��Ƕ�ײ�ѯ������" + dept.getDeptUsers().toString());
	    }

	    // ����-Ƕ�ײ�ѯ
	    @Test
	    public void selectDeptCollectionResult() {
	        ResultMapDemoMapper mapper = session.getMapper(ResultMapDemoMapper.class);
	        cn.osxm.ssmi.chp12.entity.Dept dept = mapper.selectDeptCollectionSelect("dept0001");
	        System.out.println("[����]ͨ��Ƕ�׽��������" + dept.getDeptUsers().toString());
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
