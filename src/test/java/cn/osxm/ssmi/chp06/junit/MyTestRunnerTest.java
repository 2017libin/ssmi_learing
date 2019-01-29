/**
 * @Title: MyTestRunnerTest.java
 * @Package cn.osxm.ssmi.chp6.junit
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月7日 下午10:28:44
 * @version V1.0
 */

package cn.osxm.ssmi.chp06.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;

import cn.osxm.ssmi.chp06.junit.MyTestRunner;

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
