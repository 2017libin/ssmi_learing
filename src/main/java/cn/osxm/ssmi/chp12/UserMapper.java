/**
 * @Title: UserMapper.java
 * @Package cn.osxm.ssmi.chp12
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年2月15日 下午10:24:54
 * @version V1.0
 */

package cn.osxm.ssmi.chp12;

import java.util.List;
import java.util.Map;

import cn.osxm.ssmi.com.User;

/**
 * @ClassName: UserMapper
 * @Description: TODO
 * @author osxm:oscarxueming
 */
public interface UserMapper {
	public User selectUser(String id);

	public User findUserByName(String name);

	public User selectUserOneSimpleParam(String name);

	public List<User> selectUserList(String name);

	public User selectUserMoreSimpleParam(int id, String name);

	@SuppressWarnings("rawtypes")
	public Map selectUserResultMap(String name);

	public List<User> selectUserAssociation();

	public List<User> selectUserDetail(String id);

	public int insertUser(User user);
}
