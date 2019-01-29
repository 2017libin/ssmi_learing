/**
 * @Title: UserDao.java
 * @Package cn.osxm.ssmi.chp2
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018年12月9日 上午7:25:18
 * @version V1.0
 */

package cn.osxm.ssmi.chp02;
/**
  * @ClassName: UserDao
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class UserDao2 {

	public void add(User user) {
		System.out.println("[UserDao2]Insert User to Db Table :"+user.getName());
	}
}
