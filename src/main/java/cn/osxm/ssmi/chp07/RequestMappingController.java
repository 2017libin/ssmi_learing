/**
 * @Title: RequestMappingController.java
 * @Package cn.osxm.ssmi.chp07
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年3月15日 下午10:34:46
 * @version V1.0
 */

package cn.osxm.ssmi.chp07;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
/**
  * @ClassName: RequestMappingController
  * @Description: TODO
  * @author osxm:oscarxueming
  */

@Controller
public class RequestMappingController {

    @RequestMapping(path = "/request", params = "type=withParams")
    public ModelAndView requestWithParams() {
        System.out.println("requestWithParams");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hello");
        return modelAndView;
    }
    
    @RequestMapping(path = "/request", headers = "type=withHeaderAttr")
    public ModelAndView requestWithHeader() {
        System.out.println("requestWithHeader");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hello");
        return modelAndView;
    }
}
