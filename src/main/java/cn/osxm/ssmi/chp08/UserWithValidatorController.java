/**
 * @Title: UserWithValidatorController.java
 * @Package cn.osxm.ssmi.chp08
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月18日 下午10:25:23
 * @version V1.0
 */

package cn.osxm.ssmi.chp08;
import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.osxm.ssmi.chp08.validator.UserValidator;
import cn.osxm.ssmi.com.User;
/**
  * @ClassName: UserWithValidatorController
  * @Description: TODO
  * @author osxm:oscarxueming
  */

@Controller
public class UserWithValidatorController {

    
    @RequestMapping(value="/addUserWithValidator")
    public ModelAndView add(@Validated User user, BindingResult bindingResult) {  
        ModelAndView mv = new ModelAndView();
        if(bindingResult.hasErrors()) {
            List<ObjectError> validateErrorList = bindingResult.getAllErrors();
            mv.addObject("validateErrorList", validateErrorList);
        }
        mv.addObject("user",user);
        mv.setViewName("userView");
        return mv;   
    }

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.addValidators(new UserValidator());
    }
}
