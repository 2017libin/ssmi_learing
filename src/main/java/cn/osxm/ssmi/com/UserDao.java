/**
 * @Title: UserDao.java
 * @Package cn.osxm.ssmi.com
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月14日 下午10:01:14
 * @version V1.0
 */

package cn.osxm.ssmi.com;

/**
 * @ClassName: UserDao
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public interface UserDao {
	public User getUserById(String id);
	
	public String getUserNameById(String id);
}
