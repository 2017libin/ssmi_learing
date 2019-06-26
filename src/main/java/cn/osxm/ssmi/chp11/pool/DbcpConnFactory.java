/**
 * @Title: DbcpConnFactory.java
 * @Package cn.osxm.ssmi.chp11.pool
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年6月27日 上午6:39:36
 * @version V1.0
 */

package cn.osxm.ssmi.chp11.pool;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;

/**
 * @ClassName: DbcpConnFactory
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class DbcpConnFactory {
	private static final ThreadLocal<Connection> connHolder;
	private static final BasicDataSource dataSource;
	private static final String dirver = "com.mysql.cj.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost:3306/ssmi?serverTimezone=UTC";
	private static final String username = "root";
	private static final String password = "123456";

	static {
		connHolder = new ThreadLocal<Connection>();
		dataSource = new BasicDataSource();
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(dirver);
		dataSource.setUrl(url);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
	}

	public static Connection getConnection() {
		Connection conn = connHolder.get();
		if (conn == null) {
			try {
				conn = dataSource.getConnection();
			} catch (SQLException e) {

			} finally {
				connHolder.set(conn);
			}
		}
		return conn;
	}

	public static void closeConnection() {
		Connection conn = connHolder.get();
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			} finally {
				connHolder.remove();
			}
		}
	}
}
