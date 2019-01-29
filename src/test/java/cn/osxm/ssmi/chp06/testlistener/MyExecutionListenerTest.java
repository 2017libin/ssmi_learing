/**
 * @Title: MyExecutionListenerTest.java
 * @Package cn.osxm.ssmi.chp6.testlistener
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月30日 上午5:00:22
 * @version V1.0
 */

package cn.osxm.ssmi.chp06.testlistener;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import cn.osxm.ssmi.com.anno.UserController;
/**
  * @ClassName: MyExecutionListenerTest
  * @Description: TODO
  * @author osxm:oscarxueming
  */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:cn/osxm/ssmi/chp6/applicationContext.xml" })
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class, TransactionalTestExecutionListener.class, MyLogTestExecutionListener.class,})
//@TestExecutionListeners({ MyLogTestExecutionListener.class })
public class MyExecutionListenerTest{


    @Autowired
    private UserController userController;

    @Test
    @MyLogTestAnno(logFileName = "testLog.txt")
    public void test() {

    }

    @Test
    public void test2() {    
        System.out.println(userController.getUserName("1"));
    }

}

