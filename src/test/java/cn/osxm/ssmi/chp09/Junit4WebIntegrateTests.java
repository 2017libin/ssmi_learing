/**
 * @Title: Junit4WebIntegrateTests.java
 * @Package cn.osxm.ssmi.chp08
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��5��4�� ����5:53:17
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

@RunWith(SpringRunner.class)   //��������չ
@ContextConfiguration("classpath:springmvc.xml")  //�����ļ�
@WebAppConfiguration  //webӦ��������
public class Junit4WebIntegrateTests {
    private MockMvc mockMvc;  //ģ��Mvc����

    @Autowired
    private WebApplicationContext wac;  //WebӦ��������

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build(); //��ʼ��MockMvc 
    }

    @Test
    public void getUserName() throws Exception { //���Է���
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/mvcHello"))
                .andExpect(MockMvcResultMatchers.status().is(200))
                .andExpect(MockMvcResultMatchers.forwardedUrl("/WEB-INF/view/hello.jsp"))
                .andDo(MockMvcResultHandlers.print()).andReturn();
    }
}
