/**
 * @Title: UserMapper.java
 * @Package cn.osxm.ssmi.chp13
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��2��18�� ����9:14:24
 * @version V1.0
 */

package cn.osxm.ssmi.chp13;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cn.osxm.ssmi.com.User;

/**
 * @ClassName: UserMapper
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public interface UserMapper {
	public Map<String, String> selectUserMap(int id);

	public User selectUser(int id);

	public List<User> findUserListWithNameIf(@Param("name") String name);

	public List<User> findUserListWithChoose(@Param("name") String name, @Param("deptId") int deptId);
}
