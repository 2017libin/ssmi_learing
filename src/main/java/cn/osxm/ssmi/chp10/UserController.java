/**
 * @Title: UserController.java
 * @Package cn.osxm.ssmi.chp08
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年3月29日 下午10:31:12
 * @version V1.0
 */

package cn.osxm.ssmi.chp10;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cn.osxm.ssmi.com.User;

/**
 * @ClassName: UserController
 * @Description: TODO
 * @author osxm:oscarxueming
 */

@Controller(value="chp10UserController")
public class UserController {

	@GetMapping(path = "/user/getModelView")
	// public ModelAndView getUserModelView(HttpServletRequest
	// request,HttpServletResponse response,@RequestParam String param1) throws
	// ServletException, IOException {
	public ModelAndView getUserModelView(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("userView");
		modelAndView.addObject("user", new User("Oscar"));

		String param = request.getParameter("param1");
		System.out.println("param1=" + param);
		
		String param2 = request.getParameter("param2");
		System.out.println("param2=" + param2);

//        String reqAttr1 = request.getAttribute("reqAttr1")!=null? request.getAttribute("reqAttr1").toString():null;
//        System.out.println("reqAttr1="+reqAttr1);
//        
//        
//        param1 = request.getParameter("bodyAttr1");
//        System.out.println("bodyAttr1="+param1);
//        
//        String bodyAttr1 = request.getAttribute("bodyAttr1")!=null? request.getAttribute("bodyAttr1").toString():null;
//        System.out.println("bodyAttr1="+bodyAttr1);
		return modelAndView;
	}

	@PostMapping(path = "/user/postModelView")
	public ModelAndView postModelView(HttpServletRequest request, @RequestParam(required = false) String param1,
			@RequestAttribute(required = false) String reqAttr1, @RequestBody(required = false) String body1)
			throws Exception {
		// public ModelAndView postModelView() throws Exception{
   		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("userView");
		modelAndView.addObject("user", new User("Oscar"));

		System.out.println("param1=" + param1);
		System.out.println("reqAttr1=" + reqAttr1);
		System.out.println("body1=" + body1);
		return modelAndView;
	}

	@PostMapping(path = "/user/jsonInContent")
	public ModelAndView jsonInContent(@RequestBody(required = false) User user)
			throws Exception {
		// public ModelAndView postModelView() throws Exception{
   		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("userView");
		modelAndView.addObject("user", user);
		return modelAndView;
	}
	
}

