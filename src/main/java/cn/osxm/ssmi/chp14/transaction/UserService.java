/**
 * @Title: UserService.java
 * @Package cn.osxm.ssmi.chp14.transaction
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年7月11日 下午6:12:23
 * @version V1.0
 */

package cn.osxm.ssmi.chp14.transaction;

import cn.osxm.ssmi.com.User;

/**
  * @ClassName: UserService
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public interface UserService {
	   public int addUser(User user)  ;
	   
	   public int addUserException(User user) throws Exception ;
	   
	   public int addUserRuntimeException(User user) ;
	   
	   public int addUserCatchRuntimeException(User user) ;
}
