/**
 * @Title: UserController.java
 * @Package cn.osxm.ssmi.com.anno
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月23日 下午9:49:13
 * @version V1.0
 */

package cn.osxm.ssmi.com.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
  * @ClassName: UserController
  * @Description: TODO
  * @author osxm:oscarxueming
  */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @GetMapping("/{id}")
    public String getUserName(@PathVariable String id) {
        return userServiceImpl.getUserNameById(id);
    }
}


