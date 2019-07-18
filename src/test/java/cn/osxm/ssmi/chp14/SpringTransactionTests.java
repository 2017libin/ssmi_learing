/**
 * @Title: SpringTransactionTests.java
 * @Package cn.osxm.ssmi.chp14
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年7月6日 下午1:21:01
 * @version V1.0
 */

package cn.osxm.ssmi.chp14;
/**
  * @ClassName: SpringTransactionTests
  * @Description: TODO
  * @author osxm:oscarxueming
  */

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.transaction.AfterTransaction;
import org.springframework.test.context.transaction.BeforeTransaction;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.springframework.test.jdbc.JdbcTestUtils;
import org.springframework.transaction.annotation.Transactional;

import cn.osxm.ssmi.chp14.transaction.UserDao;
import cn.osxm.ssmi.com.User;

/**
 * @ClassName: SpringTransactionTests
 * @Description: TODO
 * @author osxm:oscarxueming
 */

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:cn/osxm/ssmi/chp14/spring-transaction.xml")
@Transactional
@Rollback(false)
//@Rollback //需要结合@Transactional
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class, DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class })
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class SpringTransactionTests {

	@Autowired
	private UserDao userDao;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Test
	public void addUser() {
		userDao.add(new User(1, "Wang wu"));
	}

	@BeforeTransaction
	public void beforeTransaction() {
		int iRow = JdbcTestUtils.countRowsInTable(jdbcTemplate, "USER");
		System.out.println("事务开始,数据笔数：" + iRow);
	}

	@AfterTransaction
	public void afterTransaction() {
		int iRow = JdbcTestUtils.countRowsInTable(jdbcTemplate, "USER");
		System.out.println("事务结束,数据笔数：" + iRow);
	}
}
