/**
 * @Title: UserService.java
 * @Package cn.osxm.ssmi.chp6.webbean
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月13日 下午8:30:43
 * @version V1.0
 */

package cn.osxm.ssmi.chp06.webbean;
/**
  * @ClassName: UserService
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class UserService {
	private LoginAction loginAction;

    public UserService(LoginAction loginAction) {
        this.loginAction = loginAction;
    }

    public String login() {
        return loginAction.getUsername();
    }
}
