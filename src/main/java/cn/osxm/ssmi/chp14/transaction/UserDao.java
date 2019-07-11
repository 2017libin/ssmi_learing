/**
 * @Title: UserDao.java
 * @Package cn.osxm.ssmi.chp14.transaction
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年7月11日 下午6:11:23
 * @version V1.0
 */

package cn.osxm.ssmi.chp14.transaction;

import cn.osxm.ssmi.com.User;

/**
  * @ClassName: UserDao
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public interface UserDao {
	public void add(User user);      
	public void addNoCommit(User user);
	
//  public void add(User user);      
//  public void update(User user);
//  public List<User> queryList(Map<String,String> criteria);
//  public void delete(User user);
}
