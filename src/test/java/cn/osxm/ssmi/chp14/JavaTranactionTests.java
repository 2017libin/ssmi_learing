/**
 * 
 */
package cn.osxm.ssmi.chp14;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.transaction.UserTransaction;



/**
 * @author xuemi
 *
 */
public class JavaTranactionTests {

	   @SuppressWarnings("unused")
	public void jdbcTrans() throws Exception{
	        String driverClassName = "com.mysql.cj.jdbc.Driver";
	        String url = "jdbc:mysql://localhost:3306/ssmi?serverTimezone=UTC";
	        String username = "root";
	        String password = "123456";
	        Connection connection = DriverManager.getConnection(url, username, password);
	        connection.setAutoCommit(false);
	        connection.commit();
	        connection.rollback();
	    }
	    
	    public void jtaTrans() throws Exception{
	        Context context = new InitialContext(); 
	        UserTransaction userTransaction = (UserTransaction) context.lookup("java:comp/MyUserTransaction");
	        userTransaction.begin();
	        //执行跨数据库的调用
	        userTransaction.commit();
	        userTransaction.rollback();
	    }
}
