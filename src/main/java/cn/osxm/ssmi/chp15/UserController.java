/**
 * @Title: UserController.java
 * @Package cn.osxm.ssmi.chp15
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��7��11�� ����6:16:07
 * @version V1.0
 */

package cn.osxm.ssmi.chp15;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import cn.osxm.ssmi.com.User;

/**
 * @ClassName: UserController
 * @Description: TODO
 * @author osxm:oscarxueming
 */

@Controller
public class UserController {

	// @ExceptionHandler({ MyException.class })
	public ModelAndView userExceptionHandler(Exception e) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("error");
		mv.addObject("exception", e);
		return mv;
	}

	@RequestMapping("/exception/exceptionHandler")
	public String exceptionHandler() throws Exception {
		throw new Exception("add User Exception");
	}

	@PostMapping("/exception/responseStatus")
	// @ResponseStatus(code = HttpStatus.OK,reason = "������")
	// @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason =
	// "@ResponseStatusע�ⷽ������������Ĵ�����Ϣ��������")
	public ModelAndView responseStatus() throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("userView");
		mv.addObject("user", new User(1, "Zhang San"));
		return mv;
	}

	// @RequestMapping("/exception/responseStatusInClass")
	@PostMapping("/exception/responseStatusInClass")
	public String responseStatusInClass(@RequestParam(required = true) String id) throws Exception {
		// throw new MyException();
		return "user";
	}

}