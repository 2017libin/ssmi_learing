/**
 * @Title: MyExceptionHandlerController.java
 * @Package cn.osxm.ssmi.chp08.exceptionHandler
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月18日 下午5:44:01
 * @version V1.0
 */

package cn.osxm.ssmi.chp08.exceptionHandler;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
/**
  * @ClassName: MyExceptionHandlerController
  * @Description: TODO
  * @author osxm:oscarxueming
  */

@Controller
public class MyExceptionHandlerController {
    
    
    /*@ExceptionHandler(Exception.class)
    public ModelAndView exceptionHandler(Exception ex){
        ModelAndView mv = new ModelAndView("error");
        mv.addObject("exception", ex);
        return mv;
    }*/
    
    @GetMapping("/errorHandler")
    public String errorTest() {
        String str = null;
        if(str.equals("Test")) {
            //
        }
        return "hello";
    }

}

