/**
 * @Title: UserRestController.java
 * @Package cn.osxm.ssmi.chp15.exception
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年7月11日 下午6:16:39
 * @version V1.0
 */

package cn.osxm.ssmi.chp15.exception;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.osxm.ssmi.com.User;
/**
  * @ClassName: UserRestController
  * @Description: TODO
  * @author osxm:oscarxueming
  */

@RestController
public class UserRestController {
    
    @RequestMapping("/exception/responseEntityException")
    //@PostMapping("/exception/responseEntityException")
    public User responseEntityException() throws Exception {
        throw new MyJsonException();
        //return new User(1,"Zhang San");
    }
    

      
}
