/**
 * @Title: InitBinderTests.java
 * @Package cn.osxm.ssmi.chp08
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月5日 下午10:15:03
 * @version V1.0
 */

package cn.osxm.ssmi.chp09;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
/**
  * @ClassName: InitBinderTests
  * @Description: TODO
  * @author osxm:oscarxueming
  */
@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:springmvc.xml")
@WebAppConfiguration
public class InitBinderTests {
	 private MockMvc mockMvc;

	    @Autowired
	    private WebApplicationContext wac; // Web应用上下文

	    @Before
	    public void setup() {
	        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build(); // 初始化MockMvc
	    }

	    @Test
	    public void getUserName() throws Exception { // 测试方法
//	        mockMvc.perform(MockMvcRequestBuilders.get("/initBinderTest").param("id", "0001").param("name", "User 1").param("birthDay", "2018-01-01")).andExpect(MockMvcResultMatchers.status().is(200))
//	                .andDo(MockMvcResultHandlers.print()).andReturn();
	        
	        mockMvc.perform(MockMvcRequestBuilders.get("/initBinderTest").param("user.id", "0001").param("user.name", "User 1").param("user.birthDay", "2018-01-01")).andExpect(MockMvcResultMatchers.status().is(200))
	     .andDo(MockMvcResultHandlers.print()).andReturn();
	    }
}
