/**
 * @Title: Dbcp2Tests.java
 * @Package cn.osxm.ssmi.chp11
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��6��27�� ����6:04:38
 * @version V1.0
 */

package cn.osxm.ssmi.chp11;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Properties;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.dbcp2.BasicDataSourceFactory;
/**
  * @ClassName: Dbcp2Tests
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class Dbcp2Tests {
	
    // @Test
    @SuppressWarnings("resource")
	public void testBaseMysql() throws Exception {
        String dirver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/ssmi?serverTimezone=UTC";
        String username = "root";
        String password = "123456";

        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(dirver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setMaxTotal(30); // �����������
        dataSource.setInitialSize(10); // ��ʼ��������
        dataSource.setMinIdle(8);// ��С��������
        dataSource.setMaxIdle(16); // ����������
        dataSource.setMaxWaitMillis(6 * 10000);// ��ʱ�ȴ�ʱ�����
        Connection conn = dataSource.getConnection();// PoolableConnection
        String sql = "select * fro user";
        Statement statement = conn.createStatement();
        statement.executeQuery(sql);
        conn.close();

        // ֻ�ᷢ�ֵ�ǰ����ʧЧ���ٴ���һ�����ӹ���ǰ��ѯʹ��
        /*
         * dataSource.setTestOnBorrow(true); dataSource.setRemoveAbandonedTimeout(180);
         * //����ʱ�����ƣ�����û����(����)�����ӣ�Ĭ��Ϊ 300�룬����Ϊ180�� // removeAbandoned
         * ������removeAbandonedTimeoutʱ����Ƿ�� // ��û�����ӣ��������Ļ��գ�Ĭ��Ϊfalse������Ϊtrue) //
         * DATA_SOURCE.setRemoveAbandonedOnMaintenance(removeAbandonedOnMaintenance);
         * dataSource.setRemoveAbandonedOnBorrow(true); // testWhileIdle
         * dataSource.setTestWhileIdle(true); // testOnReturn
         * dataSource.setTestOnReturn(true); // setRemoveAbandonedOnMaintenance
         * dataSource.setRemoveAbandonedOnMaintenance(true); // ��¼��־
         * dataSource.setLogAbandoned(true); // �����Զ��ύ
         * dataSource.setDefaultAutoCommit(true);
         */

    }

    @SuppressWarnings("unused")
	public void testPropertiesFile() throws Exception {
        BasicDataSource bs = null;
        // ��������������ļ������
        Properties properties = new Properties();
        InputStream rs = Dbcp2Tests.class.getClassLoader().getResourceAsStream("dbcp.properties");
        // �����ļ��������ݵ�������
        properties.load(rs);
        // ͨ��basic�������DataSourceԴ��Ҳ�����������൱��ע��
        bs = BasicDataSourceFactory.createDataSource(properties);
    }

    // @Test
    @SuppressWarnings("resource")
	public void testBaseOracle() throws Exception {
        String dirver = "oracle.jdbc.OracleDriver";
        String url = "jdbc:oracle:thin:@pc-hfplm:1521:orcl";
        String username = "oscar999";
        String password = "oscar999";

        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(dirver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setMaxTotal(30); // �����������
        dataSource.setInitialSize(10); // ��ʼ��������
        dataSource.setMinIdle(8);// ��С��������
        dataSource.setMaxIdle(16); // ����������
        dataSource.setMaxWaitMillis(6 * 10000);// ��ʱ�ȴ�ʱ�����
        Connection conn = dataSource.getConnection();// PoolableConnection
        String sql = "select * from my_user";
        Statement statement = conn.createStatement();
        statement.executeQuery(sql);
        conn.close();

        System.out.println("ok");
    }
}
