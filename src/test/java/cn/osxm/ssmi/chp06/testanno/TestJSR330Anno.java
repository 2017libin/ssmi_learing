/**
 * @Title: TestJSR330Anno.java
 * @Package cn.osxm.ssmi.chp06.testanno
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��2��2�� ����6:01:14
 * @version V1.0
 */

package cn.osxm.ssmi.chp06.testanno;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
/**
  * @ClassName: TestJSR330Anno
  * @Description: TODO
  * @author osxm:oscarxueming
  */

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = { "classpath:cn/osxm/ssmi/chp06/testAnno.xml" })
public class TestJSR330Anno {
    
    @PostConstruct
    public void postConstruct() {
        System.out.println("PostConstruct:ÿ�����Է���ǰ���ã���@Before֮ǰ");
    }
    
    @PreDestroy
    public void preDestroy() {
        System.out.println("preDestroy:���ᱻִ��");
    }
    
    @BeforeClass
    public static void beforeClass() {
        System.out.println("BeforeAll");
    }
    
    
    @Before
    public void before() {
        System.out.println("BeforeEach");
    }
    
    @Test
    public void testMethod1() {
        System.out.println("testMethod1");
    }
    
    @Test
    public void testMethod2() {
        System.out.println("testMethod2");
    }

}

