/**
 * @Title: DbConnPoolTests.java
 * @Package cn.osxm.ssmi.chp11
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��6��17�� ����7:18:05
 * @version V1.0
 */

package cn.osxm.ssmi.chp11;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSourceFactory;
import org.junit.Test;

import com.mchange.v2.c3p0.ComboPooledDataSource;
/**
  * @ClassName: DbConnPoolTests
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class DbConnPoolTests {

    // @Test
    public void dbcpToolTest() throws Exception {
        InputStream is = DbConnPoolTests.class.getClassLoader().getResourceAsStream("cn/osxm/ssmi/chp11/dbcp.properties");
        Properties props = new Properties();
        props.load(is);
        DataSource dataSource = BasicDataSourceFactory.createDataSource(props);
        Connection connection = dataSource.getConnection();

        // 3. ָ����Ҫִ�е�SQL��� �������where���Ӿ�Ҳ���Լ��ϣ�
        String sql = "select name from user";

        // 4.ʹ��SQL����Statement��ִ�в�ѯ��ȡ�����
        PreparedStatement pstmt = connection.prepareStatement(sql);
        ResultSet rset = pstmt.executeQuery();

        // 5.ѭ����������
        while (rset.next()) {
            String userName = rset.getString(1);
            System.out.println("userName=" + userName);
        }

        // 6.������(��ѯ���Բ���Ҫ��������һ��ʹ�������ݸ��µ�ʱ��)
        // connection.commit();

        // 7.��Դ�ͷ�
        rset.close();
        pstmt.close();
        connection.close();

    }

    @Test
    public void c3p0ToolTest() throws Exception {
        ComboPooledDataSource dataSource  = new ComboPooledDataSource();
        Connection connection = dataSource.getConnection();
        
        // 3. ָ����Ҫִ�е�SQL��� �������where���Ӿ�Ҳ���Լ��ϣ�
        String sql = "select name from user";

        // 4.ʹ��SQL����Statement��ִ�в�ѯ��ȡ�����
        PreparedStatement pstmt = connection.prepareStatement(sql);
        ResultSet rset = pstmt.executeQuery();

        // 5.ѭ����������
        while (rset.next()) {
            String userName = rset.getString(1);
            System.out.println("userName=" + userName);
        }

        // 6.������(��ѯ���Բ���Ҫ��������һ��ʹ�������ݸ��µ�ʱ��)
        // connection.commit();

        // 7.��Դ�ͷ�
        rset.close();
        pstmt.close();
        connection.close();
        
        

//        ComboPooledDataSource cpds = new ComboPooledDataSource();
//        cpds.setDriverClass( "org.postgresql.Driver" ); //loads the jdbc driver            
//        cpds.setJdbcUrl( "jdbc:postgresql://localhost/testdb" );
//        cpds.setUser("swaldman");                                  
//        cpds.setPassword("test-password");                                  
            
        // the settings below are optional -- c3p0 can work with defaults
//        cpds.setMinPoolSize(5);                                     
//        cpds.setAcquireIncrement(5);
//        cpds.setMaxPoolSize(20);
    }
}
