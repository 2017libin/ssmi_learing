/**
 * @Title: UserMapper.java
 * @Package cn.osxm.ssmi.chp12
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��2��15�� ����10:24:54
 * @version V1.0
 */

package cn.osxm.ssmi.chp12;

import cn.osxm.ssmi.com.User;

/**
  * @ClassName: UserMapper
  * @Description: TODO
  * @author osxm:oscarxueming
  */
public interface UserMapper {
    public User selectUser(String id);
}

