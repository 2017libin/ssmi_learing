/**
 * @Title: UserController.java
 * @Package cn.osxm.ssmi.chp08.validator
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年6月1日 上午10:26:51
 * @version V1.0
 */

package cn.osxm.ssmi.chp08.validator;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.osxm.ssmi.chp08.User;
/**
  * @ClassName: UserController
  * @Description: TODO
  * @author osxm:oscarxueming
  */
@Controller
@Validated
public class UserController {

    
    @RequestMapping("/getUser") 
    public User get(@NotBlank(message = "User name must not Blank") @RequestParam("name") String name) {
        User user = new User();
        user.setAge(180);
        return user;
    }
   
    
    @RequestMapping("/saveUser") 
    //@Validated
    public User save(@Validated User user,BindingResult bindingResult) {
        //User user = new User();
        user.setAge(180);
        return user;
    }
}
