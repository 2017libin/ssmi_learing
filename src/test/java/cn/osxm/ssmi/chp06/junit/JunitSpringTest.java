/**
 * @Title: JunitSpringTest.java
 * @Package cn.osxm.ssmi.chp6.junit
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��1��7�� ����10:27:33
 * @version V1.0
 */

package cn.osxm.ssmi.chp06.junit;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

/**
 * @ClassName: JunitSpringTest
 * @Description: �����������˵���� ���ᳫʹ�ô˷�ʽ����Spring
 * @author oscarchen
 */

public class JunitSpringTest {

    @SuppressWarnings("unused")
	private ApplicationContext context;

    //@Before
    @BeforeClass
    public static void initSpring() {
        System.out.println("��ʼ������");
        //context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void testMethod1() {
        //context.getBean("bean1");
    }

    @Test
    public void testMethod2() {
        //context.getBean("bean2");
    }
}