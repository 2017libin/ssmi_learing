/**
 * @Title: C3p0Tests.java
 * @Package cn.osxm.ssmi.chp11
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年6月28日 上午6:29:31
 * @version V1.0
 */

package cn.osxm.ssmi.chp11;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import org.junit.BeforeClass;
import org.junit.Test;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * @ClassName: C3p0Tests
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class C3p0Tests {
	private static String dirver = null;

	private static String url = null;

	private static String username = null;

	private static String password = null;

	@BeforeClass
	public static void set() {
		dirver = "oracle.jdbc.OracleDriver";
		url = "jdbc:oracle:thin:@pc-hfplm:1521:orcl";
		username = "oscar999";
		password = "oscar999";
	}

	// @Test
	public void config() throws Exception {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setDriverClass(dirver);
		dataSource.setJdbcUrl(url);
		dataSource.setUser(username);
		dataSource.setPassword(password);
		dataSource.setInitialPoolSize(3);
		dataSource.setMaxPoolSize(10);
		dataSource.setMinPoolSize(3);

		dataSource.setAcquireIncrement(3);

		Connection conn = dataSource.getConnection();
		String sql = "select * from my_user";
		Statement statement = conn.createStatement();
		ResultSet rset = statement.executeQuery(sql);
		while (rset.next()) {
			String userName = rset.getString(1);
			System.out.println("userName=" + userName);
		}
		conn.close();
	}

	// @Test
	public void codeConfig() throws Exception {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setDriverClass(dirver);
		dataSource.setJdbcUrl(url);
		dataSource.setUser(username);
		dataSource.setPassword(password);

		dataSource.setInitialPoolSize(3);
		dataSource.setMaxPoolSize(10);
		dataSource.setMinPoolSize(3);
		Connection conn = dataSource.getConnection();

		String sql = "select * from my_user";
		Statement statement = conn.createStatement();
		ResultSet rset = statement.executeQuery(sql);
		while (rset.next()) {
			String userName = rset.getString(1);
			System.out.println("userName=" + userName);
		}
		conn.close();
	}

	// @Test
	public void propertiesFileConfig() throws Exception {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		Properties properties = new Properties();
		InputStream inputStream = C3p0Tests.class.getClassLoader()
				.getResourceAsStream("cn/osxm/ssmi/chp11/c3p0.properties");
		properties.load(inputStream);

		dataSource.setDriverClass(properties.getProperty("c3p0.driverClass"));
		dataSource.setJdbcUrl(properties.getProperty("c3p0.jdbcUrl"));
		dataSource.setUser(properties.getProperty("c3p0.user"));
		dataSource.setPassword(properties.getProperty("c3p0.password"));

		dataSource.setInitialPoolSize(Integer.valueOf(properties.getProperty("c3p0.initialPoolSize")));
		dataSource.setMaxPoolSize(Integer.valueOf(properties.getProperty("c3p0.maxPoolSize")));
		dataSource.setMinPoolSize(Integer.valueOf(properties.getProperty("c3p0.minPoolSize")));

		Connection conn = dataSource.getConnection();
		String sql = "select * from my_user";
		Statement statement = conn.createStatement();
		ResultSet rset = statement.executeQuery(sql);
		while (rset.next()) {
			String userName = rset.getString(1);
			System.out.println("userName=" + userName);
		}
		conn.close();
	}

	@Test
	public void propertiesFileConfig2() throws Exception {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();

		Connection conn = dataSource.getConnection();
		String sql = "select * from my_user";
		Statement statement = conn.createStatement();
		ResultSet rset = statement.executeQuery(sql);
		while (rset.next()) {
			String userName = rset.getString(1);
			System.out.println("userName=" + userName);
		}
		conn.close();
	}
}
