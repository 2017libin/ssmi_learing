/**
 * 
 */
package cn.osxm.ssmi.chp14;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.osxm.ssmi.chp14.transaction.UserService;
import cn.osxm.ssmi.com.User;

/**
 * @author xuemi
 *
 */
public class SpringExceptionTransactionTests {
	private static ApplicationContext context;

    @BeforeClass
    public static void setup() {
        context = new ClassPathXmlApplicationContext("spring-transaction.xml", SpringTransactionNoTestFrameTests.class);
    }

    // @Test
    public void exception() throws Exception {// 抛出Checked异常仍然会提交
        UserService userService = (UserService) context.getBean("userService");// 不能使用Class获取，因为有 @Transactional
        userService.addUserException(new User(1, "Li Si"));
        System.out.println(userService);
    }

    // @Test
    public void runtimeException() {// 抛出RuntimeException不会提交
        UserService userService = (UserService) context.getBean("userService");// 不能使用Class获取，因为有 @Transactional
        userService.addUserRuntimeException(new User(1, "Li Si"));
        System.out.println(userService);
    }

    @Test
    public void catchRuntimeException() {// 在@Transactional注解方法捕获RuntimeException,会自动提交
        UserService userService = (UserService) context.getBean("userService");// 不能使用Class获取，因为有 @Transactional
        userService.addUserCatchRuntimeException(new User(1, "Li Si"));
        System.out.println(userService);
    }
}
