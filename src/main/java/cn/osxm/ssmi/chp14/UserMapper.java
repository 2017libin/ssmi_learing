/**
 * @Title: UserMapper.java
 * @Package cn.osxm.ssmi.chp14
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年3月10日 下午2:37:14
 * @version V1.0
 */

package cn.osxm.ssmi.chp14;

import org.apache.ibatis.annotations.Param;

import cn.osxm.ssmi.com.User;

/**
  * @ClassName: UserMapper
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public interface UserMapper {
    //@Select("SELECT * FROM user WHERE id = #{id}")
    User getUser(@Param("id") String id);
}
