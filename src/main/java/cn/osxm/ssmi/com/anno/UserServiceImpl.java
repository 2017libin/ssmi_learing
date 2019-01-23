/**
 * @Title: UserServiceImpl.java
 * @Package cn.osxm.ssmi.com.anno
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月23日 下午9:50:35
 * @version V1.0
 */

package cn.osxm.ssmi.com.anno;
/**
  * @ClassName: UserServiceImpl
  * @Description: TODO
  * @author osxm:oscarxueming
  */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.osxm.ssmi.com.User;
import cn.osxm.ssmi.com.UserService;

/**
  * @ClassName: UserServiceImpl
  * @Description: TODO
  * @author oscarchen
  */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDaoImpl userDaoImpl;
    
    @Override
    public User getUserById(String id) {
        return userDaoImpl.getUserById(id);
    }

    @Override
    public String getUserNameById(String id) {
        return userDaoImpl.getUserNameById(id);
    }

}
