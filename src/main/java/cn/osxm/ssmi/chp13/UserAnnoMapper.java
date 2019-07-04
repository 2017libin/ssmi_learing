/**
 * @Title: UserAnnoMapper.java
 * @Package cn.osxm.ssmi.chp13
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年7月4日 下午11:18:46
 * @version V1.0
 */

package cn.osxm.ssmi.chp13;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import cn.osxm.ssmi.com.User;

/**
 * @ClassName: UserAnnoMapper
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public interface UserAnnoMapper {
	@Select("select * from User where id=#{id}")
	public User selectUser(int id);

	@SelectProvider(type = UserSqlBuilder.class, method = "selectUserSql")
	public User selectUserByProvider(@Param(value = "id") int id);
}
