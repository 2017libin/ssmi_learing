/**
 * @Title: InsertUpdateDeleteMapper.java
 * @Package cn.osxm.ssmi.chp12
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年3月1日 下午9:42:49
 * @version V1.0
 */

package cn.osxm.ssmi.chp12;
import java.util.Map;

import cn.osxm.ssmi.com.User;
/**
  * @ClassName: InsertUpdateDeleteMapper
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public interface InsertUpdateDeleteMapper {
	 public int insertUser(User user);

	    public int updateUser(User user);

	    public int deleteUser(User user);

	    @SuppressWarnings("rawtypes")
		public Map selectUserWithSqlElement(int id);

	    @SuppressWarnings("rawtypes")
		public Map selectUserWithSqlElementParams(int id);
}
