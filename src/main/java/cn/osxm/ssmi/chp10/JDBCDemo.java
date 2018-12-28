package cn.osxm.ssmi.chp10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCDemo {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		// 1. 定义数据库连接参数
		String driverClassName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/ssmi?serverTimezone=UTC";
		String username = "root";
		String password = "123456";

		// 2. 使用参数加载驱动类和打开数据库连接
		Class.forName(driverClassName);
		Connection connection = DriverManager.getConnection(url, username, password);

		// 3. 指定需要执行的SQL语句 （如果有where的子句也可以加上）
		String sql = "select name from user";

		// 4.使用SQL创建Statement，执行查询获取结果集
		PreparedStatement pstmt = connection.prepareStatement(sql);
		ResultSet rset = pstmt.executeQuery();

		// 5.循环或处理结果集
		while (rset.next()) {
			String userName = rset.getString(1);
			System.out.println("userName=" + userName);
		}

		// 6.事务处理(查询可以不需要开启事务，一般使用在数据更新的时候)
		// connection.commit();

		// 7.资源释放
		rset.close();
		pstmt.close();
		connection.close();

	}

}
