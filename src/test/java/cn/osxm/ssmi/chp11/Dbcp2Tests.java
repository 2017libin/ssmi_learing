/**
 * @Title: Dbcp2Tests.java
 * @Package cn.osxm.ssmi.chp11
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年6月27日 上午6:04:38
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
        dataSource.setMaxTotal(30); // 连接最大数量
        dataSource.setInitialSize(10); // 初始连接数量
        dataSource.setMinIdle(8);// 最小空闲连接
        dataSource.setMaxIdle(16); // 最大空闲连接
        dataSource.setMaxWaitMillis(6 * 10000);// 超时等待时间毫秒
        Connection conn = dataSource.getConnection();// PoolableConnection
        String sql = "select * fro user";
        Statement statement = conn.createStatement();
        statement.executeQuery(sql);
        conn.close();

        // 只会发现当前连接失效，再创建一个连接供当前查询使用
        /*
         * dataSource.setTestOnBorrow(true); dataSource.setRemoveAbandonedTimeout(180);
         * //超过时间限制，回收没有用(废弃)的连接（默认为 300秒，调整为180） // removeAbandoned
         * ：超过removeAbandonedTimeout时间后，是否进 // 行没用连接（废弃）的回收（默认为false，调整为true) //
         * DATA_SOURCE.setRemoveAbandonedOnMaintenance(removeAbandonedOnMaintenance);
         * dataSource.setRemoveAbandonedOnBorrow(true); // testWhileIdle
         * dataSource.setTestWhileIdle(true); // testOnReturn
         * dataSource.setTestOnReturn(true); // setRemoveAbandonedOnMaintenance
         * dataSource.setRemoveAbandonedOnMaintenance(true); // 记录日志
         * dataSource.setLogAbandoned(true); // 设置自动提交
         * dataSource.setDefaultAutoCommit(true);
         */

    }

    @SuppressWarnings("unused")
	public void testPropertiesFile() throws Exception {
        BasicDataSource bs = null;
        // 用类加载器加载文件获得流
        Properties properties = new Properties();
        InputStream rs = Dbcp2Tests.class.getClassLoader().getResourceAsStream("dbcp.properties");
        // 加载文件配置内容到集合中
        properties.load(rs);
        // 通过basic工厂获得DataSource源，也就是驱动，相当于注册
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
        dataSource.setMaxTotal(30); // 连接最大数量
        dataSource.setInitialSize(10); // 初始连接数量
        dataSource.setMinIdle(8);// 最小空闲连接
        dataSource.setMaxIdle(16); // 最大空闲连接
        dataSource.setMaxWaitMillis(6 * 10000);// 超时等待时间毫秒
        Connection conn = dataSource.getConnection();// PoolableConnection
        String sql = "select * from my_user";
        Statement statement = conn.createStatement();
        statement.executeQuery(sql);
        conn.close();

        System.out.println("ok");
    }
}
