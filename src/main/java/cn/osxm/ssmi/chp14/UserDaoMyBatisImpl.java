/**
 * @Title: UserDaoMyBatisImpl.java
 * @Package cn.osxm.ssmi.chp14
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年7月6日 下午1:24:37
 * @version V1.0
 */

package cn.osxm.ssmi.chp14;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.osxm.ssmi.com.User;
/**
  * @ClassName: UserDaoMyBatisImpl
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class UserDaoMyBatisImpl extends SqlSessionDaoSupport {
    public User getUser(String id) {
        return (User) getSqlSession().selectOne("cn.osxm.ssmi.chp14.UserMapper.getUser", id);
    }
}
