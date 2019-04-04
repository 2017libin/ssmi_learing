/**
 * @Title: StandaloneModelViewTests.java
 * @Package cn.osxm.ssmi.chp08
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��4��4�� ����10:57:24
 * @version V1.0
 */

package cn.osxm.ssmi.chp08;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import javax.servlet.http.Cookie;

import cn.osxm.ssmi.chp07.ResponseAnnoController;
import cn.osxm.ssmi.com.User;

import com.jayway.jsonpath.JsonPath;
/**
  * @ClassName: StandaloneModelViewTests
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class StandaloneModelViewTests {

	  private static MockMvc mockMvc;

	    @BeforeAll
	    static void setup() {
	        UserController userController = new UserController();
	        mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
	    }

	    // @Test
	    public void getUserModelView() throws Exception {
	        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/user/getModelView");
	        ResultActions resultActions = this.mockMvc.perform(requestBuilder);
	        resultActions.andExpect(status().isOk()); // ��Ӧ״̬����
	        resultActions.andExpect(MockMvcResultMatchers.view().name("userView")); // ��ͼ���ض���
	        resultActions.andExpect(MockMvcResultMatchers.model().attributeExists("user"));// ģ�ͷ��ض���
	        resultActions.andDo(MockMvcResultHandlers.print()); // ��ӡ�������Ӧ����Ϣ
	        MvcResult result = resultActions.andReturn(); // ���ؽ��
	        User user = (User) result.getModelAndView().getModel().get("user"); // �ӽ���õ�ģ������

	        // ��д
	        result = mockMvc.perform(MockMvcRequestBuilders.get("/user/getModelView")).andExpect(MockMvcResultMatchers.status().isOk())
	                .andExpect(MockMvcResultMatchers.view().name("userView")).andExpect(MockMvcResultMatchers.model().attributeExists("user"))
	                .andDo(MockMvcResultHandlers.print()).andReturn();

	        // ��̬������д
	        result = mockMvc.perform(get("/user/getModelView")).andExpect(status().isOk()).andExpect(view().name("userView"))
	                .andExpect(model().attributeExists("user")).andDo(print()).andReturn();
	    }

	    // @Test
	    public void cookieTest() throws Exception {
	        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/user/getModelView");
	        Cookie cookies = new Cookie("username", "oscar999");
	        MvcResult result = mockMvc.perform(get("/user/getModelView").cookie(cookies)).andExpect(status().isOk()).andExpect(view().name("userView"))
	                .andExpect(model().attributeExists("user")).andDo(print()).andReturn();
	    }

	    // @Test
	    public void resultMatchersTest() throws Exception {
	        mockMvc.perform(get("/user/getModelView").header("myheader", "my-header-value")).andExpect(handler().methodName("getUserModelView"))
	                .andExpect(header().exists("Content-Language"))
	                // .andExpect(content().contentType(MediaType.TEXT_HTML))
	                .andExpect(header().string("Content-Language", "en"));
	        // .andExpect(header().string("content-type", "text/html")) ;
	    }

	    //@Test
	    public void jsonResultMatcherTest() throws Exception {
	        ResponseAnnoController responseAnnoController = new ResponseAnnoController();
	        mockMvc = MockMvcBuilders.standaloneSetup(responseAnnoController).build(); //{"id":"001","name":"oscar"}
	        mockMvc.perform(get("/getResponseBody"))
	        .andExpect(jsonPath("$.name").value("oscar"))
	        .andDo(print());
	    }
	    
	    @Test
	    public void forwardResultMatcherTest() throws Exception {
	        mockMvc.perform(get("/user/getModelView"))
	        .andExpect(view().name("userView"))
	        //.andExpect(forwardedUrl("/WEB-INF/view/userView.jsp"))
	        .andDo(print());
	        
	        MvcResult result = mockMvc.perform(get("/user/getModelView")).andReturn();
	    }
	}
