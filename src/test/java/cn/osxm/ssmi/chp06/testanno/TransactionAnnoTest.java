/**
 * @Title: TransactionAnnoTest.java
 * @Package cn.osxm.ssmi.chp06.testanno
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月31日 上午5:57:04
 * @version V1.0
 */

package cn.osxm.ssmi.chp06.testanno;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Commit;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.transaction.AfterTransaction;
import org.springframework.test.context.transaction.BeforeTransaction;
import org.springframework.transaction.annotation.Transactional;

import cn.osxm.ssmi.com.User;
import cn.osxm.ssmi.com.anno.UserServiceImpl;
/**
  * @ClassName: TransactionAnnoTest
  * @Description: TODO
  * @author osxm:oscarxueming
  */

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = { "classpath:cn/osxm/ssmi/chp06/testAnno.xml" })
@Transactional
// @Rollback
public class TransactionAnnoTest                             {

    @Autowired
    private UserServiceImpl userService;

    // @Rollback(false)
    @Test
    // @Commit
    public void testUserAdd() {
        userService.add(new User("Leon"));
    }

    @Sql({"classpath:cn/osxm/ssmi/chp06/test-data.sql"})
    @Test
    public void testGetUser() {
        System.out.println(userService.getUserByName("oscar999"));
    }

    @BeforeTransaction
    void beforeTransaction() {
        System.out.println("事务开始前。。。");
    }

    @AfterTransaction
    void afterTransaction() {
        System.out.println("事务结束后。。。");
    }
}