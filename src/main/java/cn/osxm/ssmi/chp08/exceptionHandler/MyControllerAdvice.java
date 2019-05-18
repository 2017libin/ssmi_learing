/**
 * @Title: MyControllerAdvice.java
 * @Package cn.osxm.ssmi.chp08.exceptionHandler
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月18日 下午5:43:17
 * @version V1.0
 */

package cn.osxm.ssmi.chp08.exceptionHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
/**
  * @ClassName: MyControllerAdvice
  * @Description: TODO
  * @author osxm:oscarxueming
  */

@ControllerAdvice
public class MyControllerAdvice {
    
    @ExceptionHandler(Exception.class)
    public ModelAndView exceptionHandler(Exception ex){
        ModelAndView mv = new ModelAndView("error");
        mv.addObject("exception", ex);
        return mv;
    }
}
