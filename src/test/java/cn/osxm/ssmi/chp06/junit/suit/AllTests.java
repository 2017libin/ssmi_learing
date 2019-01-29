/**
 * @Title: AllTests.java
 * @Package cn.osxm.ssmi.chp6.junit.suit
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月14日 下午9:44:21
 * @version V1.0
 */

package cn.osxm.ssmi.chp06.junit.suit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
  * @ClassName: AllTests
  * @Description: TODO
  * @author osxm:oscarxueming
  */
@RunWith(Suite.class)
@SuiteClasses({ TestOne.class, TestTwo.class })
public class AllTests {

}
