/**
 * @Title: RequestMappingTest.java
 * @Package cn.osxm.ssmi.chp07
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年3月15日 下午10:31:47
 * @version V1.0
 */

package cn.osxm.ssmi.chp07;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

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
  * @ClassName: RequestMappingTest
  * @Description: TODO
  * @author osxm:oscarxueming
  */
@RunWith(SpringRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "classpath:springmvc.xml" })
public class RequestMappingTest {

    @Autowired
    public WebApplicationContext wac;

    private MockMvc mockMvc;

    private MockHttpSession session;

    @Before
    public void setUp() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
        this.session = new MockHttpSession();
    }
    
    //@Test
    public void requestWithParams() {
        try {
            String url = "/request?type=withParams";

            //Get
            MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get(url)).andExpect(MockMvcResultMatchers.status().is(200))
                    .andDo(MockMvcResultHandlers.print()).andReturn();           
            int status = mvcResult.getResponse().getStatus();
            String result = mvcResult.getResponse().getContentAsString();
            System.out.println("返回结果：" + result);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    @Test
    public void requestWithHeader() {
        try {
            String url = "/request";
//            ServletRequest request;
//      
//            HttpServletRequest req = (HttpServletRequest) request;
   

            
            //Get
            MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get(url).header("type", "withHeaderAttr")).andExpect(MockMvcResultMatchers.status().is(200))
                    .andDo(MockMvcResultHandlers.print()).andReturn();           
            int status = mvcResult.getResponse().getStatus();
            String result = mvcResult.getResponse().getContentAsString();
            System.out.println("返回结果：" + result);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    

}
