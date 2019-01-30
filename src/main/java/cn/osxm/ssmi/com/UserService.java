/**
 * @Title: UserService.java
 * @Package cn.osxm.ssmi.com
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月14日 下午9:56:07
 * @version V1.0
 */

package cn.osxm.ssmi.com;

/**
 * @ClassName: UserService
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public interface UserService {
public User getUserById(String id);
	
	public User getUserByName(String name);
	
	public String getUserNameById(String id);
	
	public void add(User user);
}
