/**
 * @Title: ComponentScanTests.java
 * @Package cn.osxm.ssmi.chp07
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月5日 下午10:12:40
 * @version V1.0
 */

package cn.osxm.ssmi.chp07;
/**
  * @ClassName: ComponentScanTests
  * @Description: TODO
  * @author osxm:oscarxueming
  */
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "classpath:springmvc.xml" })
public class ComponentScanTests {
	 @Autowired
	    public WebApplicationContext wac;

	    private MockMvc mockMvc;

	    @Before
	    public void setUp() {
	        this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	    }

	    @Test
	    public void test() throws Exception {
	        //String url = "/user/getView/1"; 
	        //String url = "/user/getJson/1";
	        String url = "/user/getModelView/1";
	        mockMvc.perform(MockMvcRequestBuilders.get(url)).andExpect(MockMvcResultMatchers.status().is(200))
	                .andDo(MockMvcResultHandlers.print()).andReturn();
	    }
}
