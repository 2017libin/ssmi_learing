/**
 * @Title: TestRunnerTest.java
 * @Package cn.osxm.ssmi.chp6.junit
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月7日 下午10:29:18
 * @version V1.0
 */

package cn.osxm.ssmi.chp6.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
  * @ClassName: TestRunnerTest
  * @Description: TODO
  * @author osxm:oscarxueming
  */

@RunWith(JUnit4.class)
public class TestRunnerTest {
    
    @Test
    public void hello() {
        int iNo = 1;
        assertEquals(iNo, 1);
    }
}
