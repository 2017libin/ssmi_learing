/**
 * @Title: MockJndiTest.java
 * @Package cn.osxm.ssmi.chp6.mock
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月23日 下午9:37:11
 * @version V1.0
 */

package cn.osxm.ssmi.chp06.mock;

import javax.naming.NamingException;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.mock.jndi.SimpleNamingContextBuilder;

import cn.osxm.ssmi.com.UserDao;

/**
 * @ClassName: MockJndiTest
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class MockJndiTest {
	@BeforeClass
    public void initForTest() throws IllegalStateException, NamingException {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/ssmi?serverTimezone=UTC");
        ds.setUsername("root");
        ds.setPassword("123456");
        SimpleNamingContextBuilder builder = new SimpleNamingContextBuilder();
        builder.bind("java:comp/env/jdbc/mydatasource", ds);
        builder.activate();
        
    }
    
    @Test
    public void test() {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml", MockJndiTest.class);
        UserDao userDao = (UserDao)applicationContext.getBean("userDao");
        System.out.println(userDao.getUserById("1"));
        
    }
}
