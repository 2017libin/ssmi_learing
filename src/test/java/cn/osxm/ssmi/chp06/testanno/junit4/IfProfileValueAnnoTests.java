/**
 * @Title: IfProfileValueAnnoTests.java
 * @Package cn.osxm.ssmi.chp06.testanno
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年2月2日 上午5:57:40
 * @version V1.0
 */

package cn.osxm.ssmi.chp06.testanno.junit4;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.IfProfileValue;
import org.springframework.test.annotation.Repeat;
import org.springframework.test.annotation.Timed;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
/**
  * @ClassName: IfProfileValueAnnoTests
  * @Description: TODO
  * @author osxm:oscarxueming
  */

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = { "classpath:cn/osxm/ssmi/chp06/testAnno.xml" })
public class IfProfileValueAnnoTests {

    @BeforeClass
    public static void beforeClass() {
        System.setProperty("env", "dev");
    }

    @IfProfileValue(name = "env", value = "dev")
    @Test
    //@Timed(millis = 1000)
    public void testMethod() {      
        System.out.println("testMethod");
        try {
            Thread.currentThread().sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    //@Test(timeout = 1000)
    public void testJunitTimeOut() {
        System.out.println("begin testJunitTimeOut");
        try {
            Thread.currentThread().sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("end testJunitTimeOut");
    }

    @Test
    @Timed(millis = 1000)
    public void testSpringTimeOut() {
        System.out.println("begin testSpringTimeOut");
        try {
            Thread.currentThread().sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("end testSpringTimeOut");
    }
    
    @Test
    @Repeat(5)
    public void testMore() {
        System.out.println("testMore");
    }
}
