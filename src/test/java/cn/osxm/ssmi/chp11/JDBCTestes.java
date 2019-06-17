/**
 * @Title: JDBCTestes.java
 * @Package cn.osxm.ssmi.chp11
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��6��17�� ����7:18:50
 * @version V1.0
 */

package cn.osxm.ssmi.chp11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @ClassName: JDBCTestes
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class JDBCTestes {
	// @Test
	public void jdbcWithDriver() throws Exception {
		// 1. �������ݿ����Ӳ���
		String driverClassName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/ssmi?serverTimezone=UTC";
		String username = "root";
		String password = "123456";

		// 2. ʹ�ò�������������ʹ����ݿ�����
		Class.forName(driverClassName);
		Connection connection = DriverManager.getConnection(url, username, password);

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
	public void jdbcNotWithDriver() throws Exception {
		// 1. �������ݿ����Ӳ���
		// String driverClassName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/ssmi?serverTimezone=UTC";
		String username = "root";
		String password = "123456";

		// 2. ʹ�ò�������������ʹ����ݿ�����
		// Class.forName(driverClassName);
		Connection connection = DriverManager.getConnection(url, username, password);

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
}
