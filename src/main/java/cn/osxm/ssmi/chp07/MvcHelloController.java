/**
 * @Title: MvcHelloController.java
 * @Package cn.osxm.ssmi.chp07
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年3月7日 下午8:43:34
 * @version V1.0
 */

package cn.osxm.ssmi.chp07;
/**
  * @ClassName: MvcHelloController
  * @Description: TODO
  * @author osxm:oscarxueming
  */
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class MvcHelloController implements Controller {

	@Autowired
	private UserService userService;
	
    public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hello");
        User user = userService.get();
        modelAndView.addObject("user", user);
        return modelAndView;
    }

}
