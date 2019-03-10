/**
 * @Title: JSR305Demo.java
 * @Package cn.osxm.ssmi.chp05.anno
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年3月4日 上午6:46:42
 * @version V1.0
 */

package cn.osxm.ssmi.chp05.anno;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
  * @ClassName: JSR305Demo
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class JSR305Demo {

	
	@Nonnull
	public static String nullToEmpty(@Nullable String s) {
	    return s == null ? "" : s;
	}
	/**
	  * @Title: main
	  * @Description: TODO
	  * @param args
	  */

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	}

}
