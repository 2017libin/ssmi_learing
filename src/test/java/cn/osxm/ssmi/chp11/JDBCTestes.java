/**
 * @Title: JDBCTestes.java
 * @Package cn.osxm.ssmi.chp11
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年6月17日 下午7:18:50
 * @version V1.0
 */

package cn.osxm.ssmi.chp11;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @ClassName: JDBCTestes
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class JDBCTestes {
	private static Connection connection;
    private int iExeTimes = 10000;
    

    @BeforeClass
    public static void openConn() throws Exception {
        String url = "jdbc:mysql://localhost:3306/ssmi?serverTimezone=UTC";
        url=url+"&useServerPrepStmts=true";
        String username = "root";
        String password = "123456";
        connection = DriverManager.getConnection(url, username, password);
    }

    @AfterClass
    public static void closeConn() throws Exception {
        connection.close();
    }

    // @Test
    public void jdbcWithDriver() throws Exception {
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

    // @Test
    public void jdbcNotWithDriver() throws Exception {
        // 1. 定义数据库连接参数
        // String driverClassName = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/ssmi?serverTimezone=UTC";
        String username = "root";
        String password = "123456";

        // 2. 使用参数加载驱动类和打开数据库连接
        // Class.forName(driverClassName);
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


    //@Test
    public void prepareStatementTime() throws Exception {
        long start = System.currentTimeMillis();
        
        String sql = "select * from user";
        PreparedStatement stmt = connection.prepareStatement(sql);       
        for(int i=0;i<iExeTimes;i++)
        {
            ResultSet rset = stmt.executeQuery();
        }        
        
        System.out.print("prepareStatement time");
        System.out.println((System.currentTimeMillis() - start) + "ms"); // 31326ms
    }
    
    //@Test
    public void statementTime() throws Exception {
        long start = System.currentTimeMillis();
        
        String sql = "select * from user";
        Statement stmt = connection.createStatement();        
        for(int i=0;i<iExeTimes;i++)
        {
            ResultSet rset = stmt.executeQuery(sql);
        }    
        System.out.print("statement time");
        System.out.println((System.currentTimeMillis() - start) + "ms"); // 31326ms
    }
    
    
    //@Test
    public void prepareStatementUsage() throws Exception {
        String sql = "select * from user where id=?";
        PreparedStatement stmt = connection.prepareStatement(sql);   
        stmt.setInt(1, 1);
        ResultSet rset = stmt.executeQuery();
        while (rset.next()) {
            String userName = rset.getString(1);
            System.out.println("userName=" + userName);
        }       
    }
    
    //@Test
    public void statementSqlInsert() throws Exception {
        String id = "1";
        //SQL 注入
        id = "1 or id != 1";
        String sql = "select * from user where id="+id;
        Statement stmt = connection.createStatement();  
        ResultSet rset = stmt.executeQuery(sql);
        while (rset.next()) {
            String userName = rset.getString(1);
            System.out.println("userName=" + userName);
        }       
    }
    
    @Test
    public void callableStatementUsage() throws Exception {
        CallableStatement cstmt = connection.prepareCall("{call my_procedure(?)}");   
        cstmt.registerOutParameter(1, java.sql.Types.VARCHAR);   
        //cstmt.executeUpdate();  
        cstmt.execute();
        byte  x= cstmt.getByte(1);   
        System.out.println("x=" + x);
    }
}
