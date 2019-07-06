/**
 * @Title: UserDao.java
 * @Package cn.osxm.ssmi.chp14
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年7月6日 下午1:23:06
 * @version V1.0
 */

package cn.osxm.ssmi.chp14;

import cn.osxm.ssmi.com.User;

/**
 * @ClassName: UserDao
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public interface UserDao {
	public User get(int id);
	
	
	
//  public void add(User user);      
//  public void update(User user);
//  public List<User> queryList(Map<String,String> criteria);
//  public void delete(User user);
}
