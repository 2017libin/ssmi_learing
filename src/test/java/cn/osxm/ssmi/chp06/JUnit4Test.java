/**
 * @Title: JUnit4Test.java
 * @Package cn.osxm.ssmi.chp6
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018年12月12日 上午5:43:43
 * @version V1.0
 */

package cn.osxm.ssmi.chp06;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
  * @ClassName: JUnit4Test
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class JUnit4Test {
	 private int iNo = 0;
	    
	    @Before
	    public void mySetUp() {
	        // "Initial Some ...."
	        iNo = 1;
	        System.out.println("Junit 4 SetUp...");
	    }

	    @Test
	    public void tStr() {
	        assertEquals(iNo, 1);
	    }
	    
	    @Test
     public void tStr2() {
         assertEquals(iNo, 1);
     }
}
