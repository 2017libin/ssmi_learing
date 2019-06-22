/**
 * @Title: RequestHeaderTests.java
 * @Package cn.osxm.ssmi.chp10
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年6月22日 下午4:50:21
 * @version V1.0
 */

package cn.osxm.ssmi.chp10;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Locale;

import javax.servlet.http.Cookie;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
  * @ClassName: RequestHeaderTests
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class RequestHeaderTests {
	 private static MockMvc mockMvc;

	    @BeforeAll
	    static void setup() {
	        RequestHeaderController controller = new RequestHeaderController();
	        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
	    }
	    
	    //@Test
	    public void headercookie() throws Exception {
	        Cookie myCookie = new Cookie("myCookie","myCookie Value");
	       mockMvc.perform(get("/requestheader/cookie").cookie(myCookie))
	               .andExpect(status().isOk()).andDo(print());
	        //mockMvc.perform(get("/requestheader/cookie").header("Cookie","myCookie=myCookie"))//不支持
	        //.andExpect(status().isOk()).andDo(print());
	    }
	    
	    @Test
	    public void locale() throws Exception {
	       mockMvc.perform(get("/requestheader/locale").locale(Locale.CHINA))
	               .andExpect(status().isOk()).andDo(print());
//	        mockMvc.perform(get("/requestheader/locale").header("Accept-Language","en"))
//	        .andExpect(status().isOk()).andDo(print());
	        
	    }
}
