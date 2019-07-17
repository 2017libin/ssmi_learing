/**
 * 
 */
package cn.osxm.ssmi.chp14;
import org.junit.BeforeClass;
import org.junit.Test;

import cn.osxm.ssmi.chp14.exception.ExceptionUsage;
import cn.osxm.ssmi.chp14.exception.MyException;

/**
 * @author xuemi
 *
 */
public class JavaExceptionTests {
	   private static ExceptionUsage exceptionUsage;

	    @BeforeClass
	    public static void setup() {
	        exceptionUsage =new ExceptionUsage();
	    }

	    @Test
	    public void myException() {
	        try {
	            exceptionUsage.myExceptionMethod();
	        } catch (MyException e) {
	            // TODO Auto-generated catch block
	            //e.printStackTrace();
	            System.out.println("处理了非运行异常");
	        }
	    }
	    
	    @Test
	    public void myRuntimeException() {
	        exceptionUsage.myRuntimeExceptionnMethod();
	    }
}
