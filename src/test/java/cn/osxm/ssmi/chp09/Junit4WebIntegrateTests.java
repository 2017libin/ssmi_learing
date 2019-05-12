/**
 * @Title: Junit4WebIntegrateTests.java
 * @Package cn.osxm.ssmi.chp08
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月4日 下午5:53:17
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
  * @ClassName: Junit4WebIntegrateTests
  * @Description: TODO
  * @author osxm:oscarxueming
  */

@RunWith(SpringRunner.class)   //运行器扩展
@ContextConfiguration("classpath:springmvc.xml")  //配置文件
@WebAppConfiguration  //web应用上下文
public class Junit4WebIntegrateTests {
    private MockMvc mockMvc;  //模拟Mvc变量

    @Autowired
    private WebApplicationContext wac;  //Web应用上下文

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build(); //初始化MockMvc 
    }

    @Test
    public void getUserName() throws Exception { //测试方法
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/mvcHello"))
                .andExpect(MockMvcResultMatchers.status().is(200))
                .andExpect(MockMvcResultMatchers.forwardedUrl("/WEB-INF/view/hello.jsp"))
                .andDo(MockMvcResultHandlers.print()).andReturn();
    }
}
