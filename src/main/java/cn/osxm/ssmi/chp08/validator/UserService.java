/**
 * @Title: UserService.java
 * @Package cn.osxm.ssmi.chp08.validator
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年6月1日 上午10:27:32
 * @version V1.0
 */

package cn.osxm.ssmi.chp08.validator;
/**
  * @ClassName: UserService
  * @Description: TODO
  * @author osxm:oscarxueming
  */

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import cn.osxm.ssmi.chp08.User;

/**
  * @ClassName: UserService
  * @Description: TODO
  * @author oscarchen
  */

@Service
@Validated
public class UserService {

    public @Valid User get(@NotNull String name) {
        User user = new User();
        user.setAge(180);
        return user;
    }
    
    public void add(@Valid User user) {
        //do add 
    }
}

