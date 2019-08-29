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
    public void exception() throws Exception {// �׳�Checked�쳣��Ȼ���ύ
        UserService userService = (UserService) context.getBean("userService");// ����ʹ��Class��ȡ����Ϊ�� @Transactional
        userService.addUserException(new User(1, "Li Si"));
        System.out.println(userService);
    }

    // @Test
    public void runtimeException() {// �׳�RuntimeException�����ύ
        UserService userService = (UserService) context.getBean("userService");// ����ʹ��Class��ȡ����Ϊ�� @Transactional
        userService.addUserRuntimeException(new User(1, "Li Si"));
        System.out.println(userService);
    }

    @Test
    public void catchRuntimeException() {// ��@Transactionalע�ⷽ������RuntimeException,���Զ��ύ
        UserService userService = (UserService) context.getBean("userService");// ����ʹ��Class��ȡ����Ϊ�� @Transactional
        userService.addUserCatchRuntimeException(new User(1, "Li Si"));
        System.out.println(userService);
    }
}
