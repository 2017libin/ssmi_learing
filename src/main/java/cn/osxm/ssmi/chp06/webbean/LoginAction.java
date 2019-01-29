/**
 * @Title: LoginAction.java
 * @Package cn.osxm.ssmi.chp6.webbean
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月13日 下午8:24:08
 * @version V1.0
 */

package cn.osxm.ssmi.chp06.webbean;
/**
  * @ClassName: LoginAction
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class LoginAction {
	  private String username;

	    private String password;

	    public String getUsername() {
	        return username;
	    }

	    public LoginAction(String username, String password) {
	        this.username = username;
	        this.password = password;
	    }
}
