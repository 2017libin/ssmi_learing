/**
 * @Title: RequestBodyTests.java
 * @Package cn.osxm.ssmi.chp08
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月4日 下午5:55:09
 * @version V1.0
 */

package cn.osxm.ssmi.chp09;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
/**
  * @ClassName: RequestBodyTests
  * @Description: TODO
  * @author osxm:oscarxueming
  */

@SpringJUnitWebConfig(locations = { "classpath:springmvc.xml" })
public class RequestBodyTests {
    private MockMvc mockMvc;

    @BeforeEach
    void setup(WebApplicationContext wac) {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    @Test
    public void getUserName() throws Exception {
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/user/1")).andExpect(MockMvcResultMatchers.status().is(200))
                .andDo(MockMvcResultHandlers.print()).andReturn();
        String result = mvcResult.getResponse().getContentAsString();
        System.out.println("返回结果：" + result);

        this.mockMvc.perform(get("/user/1").accept(MediaType.parseMediaType("application/json;charset=UTF-8"))).andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Chen Oscar"));
    }
}

