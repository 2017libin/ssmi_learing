/**
 * @Title: ResultMatchTests.java
 * @Package cn.osxm.ssmi.chp10
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年6月23日 下午1:41:08
 * @version V1.0
 */

package cn.osxm.ssmi.chp10;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import javax.servlet.http.Cookie;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.result.StatusResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
  * @ClassName: ResultMatchTests
  * @Description: TODO
  * @author osxm:oscarxueming
  */

@SpringJUnitWebConfig(locations = { "classpath:springmvc.xml" })
public class ResultMatchTests {
    private static MockMvc mockMvc;

    @BeforeAll
    static void setup() {
        UserController controller = new UserController();
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }

    @Test
    public void resultMatch() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/user/getModelView"); // 构造请求
        ResultActions resultActions = this.mockMvc.perform(requestBuilder); // 执行请求，返回结果
        StatusResultMatchers statusResultMatchers = MockMvcResultMatchers.status();
        ResultMatcher resultMatcher = statusResultMatchers.isOk();
        resultActions.andExpect(resultMatcher);

    }
}

