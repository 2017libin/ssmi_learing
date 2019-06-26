/**
 * @Title: ThreadConnManager.java
 * @Package cn.osxm.ssmi.chp11
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��6��27�� ����6:59:25
 * @version V1.0
 */

package cn.osxm.ssmi.chp11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.omg.CORBA.portable.ApplicationException;

/**
 * @ClassName: ThreadConnManager
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class ThreadSafeConnManager {
	private static ThreadLocal<Connection> connectionHolder = new ThreadLocal<Connection>();

	public static Connection getConnection() {
		Connection conn = connectionHolder.get();
		// ����ڵ�ǰ�߳���û�а���Ӧ��Connection
		if (conn == null) {
			try {
				String url = "jdbc:mysql://localhost:3306/ssmi?serverTimezone=UTC";
				url = url + "&useServerPrepStmts=true";
				String username = "root";
				String password = "123456";
				conn = DriverManager.getConnection(url, username, password);
				// ��Connection���õ��̱߳���ThreadLocal��
				connectionHolder.set(conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return conn;
	}

	/**
	 * �ر����ӣ�ֻ�رյ�ǰ�̵߳�����
	 */
	public static void closeConnection() {
		Connection conn = connectionHolder.get();
		if (conn != null) {
			try {
				conn.close();
				// ��ThreadLocal�����Connection
				connectionHolder.remove();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void close(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void close(Statement pstmt) {
		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void close(ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void beginTransaction(Connection conn) {
		try {
			if (conn != null) {
				if (conn.getAutoCommit()) {
					conn.setAutoCommit(false); // �ֶ��ύ
				}
			}
		} catch (SQLException e) {
		}
	}

	public static void commitTransaction(Connection conn) {
		try {
			if (conn != null) {
				if (!conn.getAutoCommit()) {
					conn.commit();
				}
			}
		} catch (SQLException e) {
		}
	}

	public static void rollbackTransaction(Connection conn) {
		try {
			if (conn != null) {
				if (!conn.getAutoCommit()) {
					conn.rollback();
				}
			}
		} catch (SQLException e) {
		}
	}

}
