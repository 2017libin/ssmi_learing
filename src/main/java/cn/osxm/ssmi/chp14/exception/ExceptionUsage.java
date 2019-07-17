/**
 * 
 */
package cn.osxm.ssmi.chp14.exception;

/**
 * @author xuemi
 *
 */
public class ExceptionUsage {
	  public String myExceptionMethod() throws MyException {
	        throw new MyException("My Exception");
	    }

	    public String myRuntimeExceptionnMethod() {
	        throw new MyRuntimeException("My Runtime Exception");
	    }
}
