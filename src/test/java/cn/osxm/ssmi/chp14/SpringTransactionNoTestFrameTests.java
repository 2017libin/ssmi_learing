/**
 * @Title: SpringTransactionNoTestFrameTests.java
 * @Package cn.osxm.ssmi.chp14
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年7月10日 下午10:57:14
 * @version V1.0
 */

package cn.osxm.ssmi.chp14;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import cn.osxm.ssmi.chp14.transaction.UserService;
import cn.osxm.ssmi.chp14.transaction.UserDao;
import cn.osxm.ssmi.com.User;
/**
  * @ClassName: SpringTransactionNoTestFrameTests
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class SpringTransactionNoTestFrameTests {
	  private static ApplicationContext context;
	    private static PlatformTransactionManager transactionManager;
	    private static JdbcTemplate jdbcTemplate;
	    private static UserDao userDao;

	    @BeforeClass
	    public static void setup() {
	        context = new ClassPathXmlApplicationContext("spring-transaction.xml", SpringTransactionNoTestFrameTests.class);
	        transactionManager = (PlatformTransactionManager) context.getBean("transactionManager");
	        jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
	        userDao = (UserDao) context.getBean("userDao");
	    }
	    
	    //@Test
	    public void platformTransactionManagerJdbcTemplate() {
	        DefaultTransactionDefinition def = new DefaultTransactionDefinition();  
	        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);        
	        TransactionStatus status = transactionManager.getTransaction(def);
	        String sql = "insert into user(name) values(?)";
	        jdbcTemplate.update(sql, "Zhang San");
	        transactionManager.commit(status);              
	    }
	    //@Test
	    public void platformTransactionManagerConnection() throws SQLException {
	        DefaultTransactionDefinition def = new DefaultTransactionDefinition();  
	        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);   
	        //def.setPropagationBehavior(TransactionDefinition.PROPAGATION_NOT_SUPPORTED);     
	        TransactionStatus status = transactionManager.getTransaction(def);
	        DataSource dataSource = (DataSource) context.getBean("dbcpdataSource");     
	        //DataSource dataSource = (DataSource) context.getBean("dataSource");  
	        Connection conn = DataSourceUtils.getConnection(dataSource); 
	        //conn.setAutoCommit(false);  //DriverManagerDataSource设置之后platformTransactionManager就无效了
	        String sql = "insert into user(name) values(?)";
	        PreparedStatement pstmt =  conn.prepareStatement(sql);
	        pstmt.setString(1, "Zhang San");
	        pstmt.execute();
	        pstmt.close();
	        transactionManager.commit(status);    
	        DataSourceUtils.releaseConnection(conn, dataSource);  
	    }
	    
	    //@Test
	    public void platformTransactionManagerTranTemplate() throws SQLException {
	        final String sql = "insert into user(name) values(?)";
	        TransactionTemplate transactionTemplate = new TransactionTemplate(transactionManager);  
	        transactionTemplate.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);//默认值PROPAGATION_REQUIRED
	        //transactionTemplate.setIsolationLevel(TransactionDefinition.ISOLATION_READ_COMMITTED);  
	        transactionTemplate.execute(new TransactionCallbackWithoutResult() {  
	            @Override  
	            protected void doInTransactionWithoutResult(TransactionStatus status) {  
	               jdbcTemplate.update(sql, "Zhang San");  
	        }});  
	    }
	    
	    //@Test
	    public void beanTransactionProxy() throws SQLException {
	        //userDao.add(new User("Li Si")); 
	        UserDao userDaoProxy = (UserDao) context.getBean("userDaoProxy");
	        userDaoProxy.add(new User("Li Si"));
	    }
	    
	    @Test
	    public void c3p0PureTransction()  throws Exception {
	        DataSource dataSource = (DataSource) context.getBean("c3p0dataSource");    
	        Connection conn = dataSource.getConnection();
	        conn.setAutoCommit(false);
	        String sql = "insert into user(name) values(?)";
	        PreparedStatement pstmt =  conn.prepareStatement(sql);
	        pstmt.setString(1, "Zhang San");
	        pstmt.execute();
	        pstmt.close();  
	        conn.close();  
	    }
}
