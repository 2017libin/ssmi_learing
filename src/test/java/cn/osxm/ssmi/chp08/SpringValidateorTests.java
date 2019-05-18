/**
 * @Title: SpringValidateorTests.java
 * @Package cn.osxm.ssmi.chp08
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月18日 下午5:36:26
 * @version V1.0
 */

package cn.osxm.ssmi.chp08;
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

import cn.osxm.ssmi.com.User;
/**
  * @ClassName: SpringValidateorTests
  * @Description: TODO
  * @author osxm:oscarxueming
  */

@RunWith(SpringRunner.class)
@ContextConfiguration(locations ="classpath:cn/osxm/ssmi/chp08/springmvc.xml")
@WebAppConfiguration
public class SpringValidateorTests {
    private MockMvc mockMvc;  //模拟Mvc变量

    @Autowired
    private WebApplicationContext wac;  //Web应用上下文

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build(); //初始化MockMvc 
    }

    @Test
    public void validTest() throws Exception {
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/addUserWithValidator").param("age", "180"))
                .andExpect(MockMvcResultMatchers.status().is(200))
                .andDo(MockMvcResultHandlers.print()).andReturn();
    }
    
}