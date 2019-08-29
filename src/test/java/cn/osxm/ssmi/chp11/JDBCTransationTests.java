/**
 * @Title: JDBCTransationTests.java
 * @Package cn.osxm.ssmi.chp11
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年6月27日 上午6:06:03
 * @version V1.0
 */

package cn.osxm.ssmi.chp11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @ClassName: JDBCTransationTests
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class JDBCTransationTests {
	private static Connection connection;

	@BeforeClass
	public static void openConn() throws Exception {
		String url = "jdbc:mysql://localhost:3306/ssmi?serverTimezone=UTC";
		url = url + "&useServerPrepStmts=true";
		String username = "root";
		String password = "123456";
		connection = DriverManager.getConnection(url, username, password);
	}

	@SuppressWarnings("unused")
	@Test
	public void queryTrans() throws Exception {
		String sql = "select * from user";
		Statement stmt = connection.createStatement();
		ResultSet rset = stmt.executeQuery(sql);
		connection.commit();
	}
}
