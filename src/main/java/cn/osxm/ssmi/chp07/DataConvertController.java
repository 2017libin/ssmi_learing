/**
 * @Title: DataConvertController.java
 * @Package cn.osxm.ssmi.chp07
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月19日 上午10:19:27
 * @version V1.0
 */

package cn.osxm.ssmi.chp07;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
/**
  * @ClassName: DataConvertController
  * @Description: TODO
  * @author osxm:oscarxueming
  */

@Controller
@RequestMapping("/dataConvert")
public class DataConvertController {
    
    @RequestMapping("/dateTimeFormatSupport")
    public ModelAndView dateTimeFormatSupport(@ModelAttribute User user) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");
        mv.addObject("user", user);
        return mv;
    }
    
    @RequestMapping("/numberFormatSupport")
    public ModelAndView numberFormatSupport(@ModelAttribute User user) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");
        mv.addObject("user", user);
        return mv;
    }
    
    @RequestMapping("/validSupport")
    //public ModelAndView validSupport(@Valid  @ModelAttribute User user) {
    public ModelAndView validSupport( User user,String name) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");
        mv.addObject("user", user);
        return mv;
    }
    
}

