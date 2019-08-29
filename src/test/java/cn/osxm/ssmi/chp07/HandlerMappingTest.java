/**
 * @Title: HandlerMappingTest.java
 * @Package cn.osxm.ssmi.chp07
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年3月12日 下午10:36:31
 * @version V1.0
 */

package cn.osxm.ssmi.chp07;
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
  * @ClassName: HandlerMappingTest
  * @Description: TODO
  * @author osxm:oscarxueming
  */

@RunWith(SpringRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "classpath:springmvc.xml" })
public class HandlerMappingTest {
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

    @Test
    public void urlMapping() {
        try {
            MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/hello")).andExpect(MockMvcResultMatchers.status().is(200))
                    .andDo(MockMvcResultHandlers.print()).andReturn();
            int status = mvcResult.getResponse().getStatus();
            
            System.out.println("请求状态码：" + status);
            String result = mvcResult.getResponse().getContentAsString();
            System.out.println("返回结果：" + result);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    
    //@Test
    public void beanNameMapping() {
        try {
            MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/mvcHello")).andExpect(MockMvcResultMatchers.status().is(200))
                    .andDo(MockMvcResultHandlers.print()).andReturn();
            int status = mvcResult.getResponse().getStatus();
            System.out.println("请求状态码：" + status);
            String result = mvcResult.getResponse().getContentAsString();
            System.out.println("返回结果：" + result);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    
    //@Test
    public void annoMapping() {
        try {
            MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/anno-demo/hello")).andExpect(MockMvcResultMatchers.status().is(200))
                    .andDo(MockMvcResultHandlers.print()).andReturn();
            int status = mvcResult.getResponse().getStatus();
            System.out.println("请求状态码：" + status);
            String result = mvcResult.getResponse().getContentAsString();
            System.out.println("返回结果：" + result);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
