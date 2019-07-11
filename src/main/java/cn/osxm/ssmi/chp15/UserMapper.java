/**
 * @Title: UserMapper.java
 * @Package cn.osxm.ssmi.chp15
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年7月10日 下午10:59:32
 * @version V1.0
 */

package cn.osxm.ssmi.chp15;

import cn.osxm.ssmi.com.User;

/**
 * @ClassName: UserMapper
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public interface UserMapper {
	public User getUser(int id);
}
