/**
 * @Title: MessageController.java
 * @Package cn.osxm.ssmi.chp09
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年6月7日 上午10:31:52
 * @version V1.0
 */

package cn.osxm.ssmi.chp09;

import java.util.Locale;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContextUtils;
/**
  * @ClassName: MessageController
  * @Description: TODO
  * @author osxm:oscarxueming
  */

@Controller
public class MessageController {
	@Autowired
	private HttpServletRequest request;

	@Autowired
	private MessageSource messageSource;
	
	
	@Autowired
	private ApplicationContext applicationContext;
	
    @GetMapping("/message/login")
    public String login(@CookieValue(name="myLanguage",defaultValue="0") String myLanguage,HttpServletRequest request,HttpServletResponse response) {
        Cookie myLanguageCookie = new Cookie("myLanguage","zh");
        myLanguageCookie.setMaxAge(36000);
        myLanguageCookie.setPath("/ssmi");
        response.addCookie(myLanguageCookie);
        //request.getCookies()
        //RequestContextUtils.getLocaleResolver(request).setLocale(request, response, new Locale("en"));
        return "login";
    }
    
    @GetMapping("/addCookie")
    public String addCookie(HttpServletResponse response) {
        Cookie myLanguageCookie = new Cookie("myLanguage","zh");
        myLanguageCookie.setMaxAge(36000);
        myLanguageCookie.setPath("/ssmi");
        response.addCookie(myLanguageCookie);
        return "login";
    }
    @GetMapping("/getCookie")
    public String getCookie(@CookieValue(name="myLanguage") String myLanguage) {
    	System.out.println(myLanguage);
        return "login";
    }
    
    @GetMapping("/getLocalFromRequest")
    public ModelAndView getRequestLocale(HttpServletRequest request) {
    	//LocaleResolver
        Locale defaultLocal= (Locale) request.getAttribute("org.springframework.web.servlet.i18n.CookieLocaleResolver.LOCALE");
        System.out.println("defaultLocal="+defaultLocal);
        
        
    	ModelAndView mv = new ModelAndView();
    	Locale locale = RequestContextUtils.getLocale(request);  //AcceptHeaderLocaleResolver
    	//MockHttpServletRequest
        //FixedLocaleResolver 
    	String acceptlanguage =  request.getHeader("Accept-Language");
    	//request.getLocale()
    	System.out.println("Accept-Language="+acceptlanguage);
    	mv.setViewName("locale");
    	String userName = applicationContext.getMessage("username", null, locale);
    	messageSource.getMessage("username", null, locale);
    	System.out.println(userName);
    	return mv;
    	//	CookieLocaleResolver
    }
}
