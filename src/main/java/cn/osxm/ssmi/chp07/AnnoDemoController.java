/**
 * @Title: AnnoDemoController.java
 * @Package cn.osxm.ssmi.chp7
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018年12月20日 上午7:08:33
 * @version V1.0
 */

package cn.osxm.ssmi.chp07;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName: AnnoDemoController
 * @Description: TODO
 * @author osxm:oscarxueming
 */

@Controller
@RequestMapping("/anno-demo")
public class AnnoDemoController {

	@PostConstruct
    public void init() {
        System.out.println("[注解@PostConstruct，AnnoDemoController]初始化方法回调．．．");
    }

    @GetMapping("/hello")
    public ModelAndView hello() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hello");
        User user = new User("1", "User 1");
        modelAndView.addObject("user", user);
        return modelAndView;
    }
    
    @RequestMapping("/hello*")
    public ModelAndView urlMatch() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hello");
        User user = new User("1", "User 1");
        modelAndView.addObject("user", user);
        return modelAndView;
    }
    
    @RequestMapping(value = "/users", method = RequestMethod.POST, consumes="application/json", produces="application/json")    
    @ResponseBody  
    public List<User> addUser(@RequestBody User userl) {           
        return null;  
    }   
    
    @RequestMapping("/helloWithParam")
    //public ModelAndView helloWithParam(@RequestParam(value="userName", required=false) String userNameBack) {
    //public ModelAndView helloWithParam(@RequestParam(value="userName", required=false) String userName) {
    public ModelAndView helloWithParam(@RequestParam String userName) {
        System.out.println("传递参数："+userName);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hello");
        User user = new User("1",userName);
        modelAndView.addObject("user", user);
        return modelAndView;
    }
    
    @RequestMapping(value="/helloWithParamObject",method=RequestMethod.GET)
    public ModelAndView helloWithParamObject(User user) {
        System.out.println("自动装箱："+user.getName());
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user", user);
        return modelAndView;
    }

    @RequestMapping(value="/helloPathVariable/{userName}")
    public ModelAndView helloPathVariable(@PathVariable String userName) {
        System.out.println("PathVariable："+userName);
        ModelAndView modelAndView = new ModelAndView();
        return modelAndView;
    }
    
    @RequestMapping(value="/helloMartrixVariable/{userName}")
    public ModelAndView helloMartrixVariable(@PathVariable String userName,@MatrixVariable(name="id", pathVar="userName") String userId) {
        System.out.println("PathVariable userName："+userName);
        System.out.println("MartrixVariable userId："+userId);
        ModelAndView modelAndView = new ModelAndView();
        return modelAndView;
    }
    
    ///anno-demo/dept/dept001;att1=value1/user/user001;att1=value11;att2=value2
    @RequestMapping(value="/dept/{deptId}/user/{userId}")
    public ModelAndView helloMultiMartrixVariable(@MatrixVariable MultiValueMap<String, String> matrixVars,@MatrixVariable(pathVar="userId")  MultiValueMap<String, String> userAtts) {
        System.out.println("matrixVars:"+matrixVars.toString()); //{att1=[value1, value11], att2=[value2]}
        System.out.println("userAtts:"+userAtts.toString()); //{att1=[value11], att2=[value2]}
        ModelAndView modelAndView = new ModelAndView();
        return modelAndView;
    }
    
}