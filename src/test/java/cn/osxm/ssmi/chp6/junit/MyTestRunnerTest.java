/**
 * @Title: MyTestRunnerTest.java
 * @Package cn.osxm.ssmi.chp6.junit
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月7日 下午10:28:44
 * @version V1.0
 */

package cn.osxm.ssmi.chp6.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
  * @ClassName: MyTestRunnerTest
  * @Description: TODO
  * @author osxm:oscarxueming
  */

@RunWith(MyTestRunner.class)
public class MyTestRunnerTest {
    
    @Test
    public void hello() {
        int iNo = 1;
        assertEquals(iNo, 1);
    }
}
