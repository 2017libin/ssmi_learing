/**
 * 
 */
package cn.osxm.ssmi.chp14.transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.osxm.ssmi.com.User;

/**
 * @author xuemi
 *
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    public int addUser(User user) {
        userDao.add(user);
        return 1;
    }

    @Transactional
    public int addUserException(User user) throws Exception {
        userDao.add(user);
        throw new Exception("Throw Exception");

    }

    @Transactional(rollbackFor= NullPointerException.class)
    //@Transactional(rollbackFor= {NullPointerException.class,NumberFormatException.class})
    public int addUserRuntimeException(User user) {
        userDao.add(user);
        throw new RuntimeException("Throw Runtime Exception");
    }

    @Transactional
    public int addUserCatchRuntimeException(User user) {
        int iSize = 0;
        try {
            userDao.add(user);
            throw new RuntimeException("Throw Runtime Exception");
        } catch (RuntimeException re) {
            System.out.println("捕获运行时异常并处理");
        }
        return iSize;
    }
}
