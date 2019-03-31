/**
 * @Title: UserController.java
 * @Package cn.osxm.ssmi.chp08
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年3月29日 下午10:31:12
 * @version V1.0
 */

package cn.osxm.ssmi.chp08;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.osxm.ssmi.com.User;
/**
  * @ClassName: UserController
  * @Description: TODO
  * @author osxm:oscarxueming
  */

@Controller
public class UserController {

    @GetMapping(path = "/user/getModelView")
    public ModelAndView getUserModelView(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("userView");
        modelAndView.addObject("user", new User("Oscar"));
        return modelAndView;
    }
}
