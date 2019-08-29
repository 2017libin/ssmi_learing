/**
 * @Title: SpringMVCLogTests.java
 * @Package cn.osxm.ssmi.chp15
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年7月11日 下午6:08:19
 * @version V1.0
 */

package cn.osxm.ssmi.chp15;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpSession;
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
  * @ClassName: SpringMVCLogTests
  * @Description: TODO
  * @author osxm:oscarxueming
  */

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:cn/osxm/ssmi/chp15/spring-mybatis.xml")
@WebAppConfiguration
public class SpringMVCLogTests {
    
    //protected static final Log logger = LogFactory.getLog(SpringMVCLogTests.class);
    
    @Autowired
    public WebApplicationContext wac;

    private MockMvc mockMvc; 

    @SuppressWarnings("unused")
	private MockHttpSession session;

    @Before
    public void setUp() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
        this.session = new MockHttpSession();
    }

    @SuppressWarnings("unused")
	@Test
    public void exceptionHandlerAnno() throws Exception {
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/springlog/getuser"))
                .andExpect(MockMvcResultMatchers.status().is(200)).andDo(MockMvcResultHandlers.print()).andReturn();
    }
}
