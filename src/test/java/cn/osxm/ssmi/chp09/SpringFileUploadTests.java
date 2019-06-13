/**
 * @Title: SpringFileUploadTests.java
 * @Package cn.osxm.ssmi.chp09
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年6月13日 下午8:42:10
 * @version V1.0
 */

package cn.osxm.ssmi.chp09;
import java.io.File;
import java.io.FileInputStream;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.multipart.MultipartFile;

/**
  * @ClassName: SpringFileUploadTests
  * @Description: TODO
  * @author osxm:oscarxueming
  */

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:cn/osxm/ssmi/chp09/file-upload.xml")
@WebAppConfiguration
public class SpringFileUploadTests {
    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext wac;

    @Before
    public void setup() {
        // 'LocalValidatorFactoryBean
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    //@Test
    public void springCommonFileUpload() throws Exception {
        FileInputStream fi1 = new FileInputStream(new File("D:\\test.xlsx"));
        MockMultipartFile mockMultipartFile = new MockMultipartFile("myfile", "test.xlsx","multipart/form-data",fi1);
        mockMvc.perform(MockMvcRequestBuilders.multipart("/springCommonFileUpload")
                .file(mockMultipartFile)
                .characterEncoding("UTF-8"))
        .andExpect(MockMvcResultMatchers.status().isOk());
    }
    



    //@Test
    public void springServletFileUpload() throws Exception {
        FileInputStream fi1 = new FileInputStream(new File("D:\\test.xlsx"));
        MockMultipartFile mockMultipartFile = new MockMultipartFile("myfile", "test.xlsx","multipart/form-data",fi1);
        mockMvc.perform(MockMvcRequestBuilders.multipart("/springServletFileUpload")
                .file(mockMultipartFile)
                .characterEncoding("UTF-8"))
        .andExpect(MockMvcResultMatchers.status().isOk());
    }
    
    //@Test
    public void springAnnoFileUpload() throws Exception {
        FileInputStream fi1 = new FileInputStream(new File("D:\\test.xlsx"));
        MockMultipartFile mockMultipartFile = new MockMultipartFile("myfile", "test.xlsx","multipart/form-data",fi1);
        mockMvc.perform(MockMvcRequestBuilders.multipart("/springAnnoFileUpload")
                .file(mockMultipartFile)
                .characterEncoding("UTF-8"))
        .andExpect(MockMvcResultMatchers.status().isOk());
    }
    
    //@Test
    public void springMultiFileUpload() throws Exception {
        FileInputStream fi1 = new FileInputStream(new File("D:\\test1.xlsx"));
        FileInputStream fi2 = new FileInputStream(new File("D:\\test2.xlsx"));
        MockMultipartFile mockMultipartFile1 = new MockMultipartFile("myfile", "test1.xlsx","multipart/form-data",fi1);
        MockMultipartFile mockMultipartFile2 = new MockMultipartFile("myfile", "test2.xlsx","multipart/form-data",fi2);
        mockMvc.perform(MockMvcRequestBuilders.multipart("/springMultiFileUpload")
                .file(mockMultipartFile1).file(mockMultipartFile2)
                .characterEncoding("UTF-8"))
        .andExpect(MockMvcResultMatchers.status().isOk());
    }
    @Test
    public void springMultiFileUpload2() throws Exception {
        FileInputStream fi1 = new FileInputStream(new File("D:\\test1.xlsx"));
        FileInputStream fi2 = new FileInputStream(new File("D:\\test2.xlsx"));
        MockMultipartFile mockMultipartFile1 = new MockMultipartFile("myfile1", "test1.xlsx","multipart/form-data",fi1);
        MockMultipartFile mockMultipartFile2 = new MockMultipartFile("myfile2", "test2.xlsx","multipart/form-data",fi2);
        mockMvc.perform(MockMvcRequestBuilders.multipart("/springMultiFileUpload2")
                .file(mockMultipartFile1).file(mockMultipartFile2)
                .characterEncoding("UTF-8"))
        .andExpect(MockMvcResultMatchers.status().isOk());
    }
    
    
    //@Test
    public void getJsonUserByResponseWriter() throws Exception {
        MockMultipartFile file = new MockMultipartFile("myfile", "test.xlsx", "application/ms-excel",
                new FileInputStream(new File("D:\\test.xlsx")));
         file = new MockMultipartFile("myfile", "test.txt", null,
                "test data".getBytes());
        
        
//        ResultActions resultActions =  mockMvc.perform(MockMvcRequestBuilders.multipart("/springcommonupload").file(file).contentType(MediaType.MULTIPART_FORM_DATA)); 
//        MvcResult mvcResult =  resultActions.andDo(MockMvcResultHandlers.print()).andExpect(MockMvcResultMatchers.status().isOk()).andReturn();
//        String result = mvcResult.getResponse().getContentAsString();
//        MockHttpServletRequestBuilder builder =
//                MockMvcRequestBuilders.multipart("/springservletupload")
//                                      .file(file);
//        MockHttpServletRequestBuilder builder =
//                MockMvcRequestBuilders.fileUpload("/springservletupload")
//                                      .file(file);
//  
//        this.mockMvc.perform(builder).andExpect(MockMvcResultMatchers.status().isOk());
         
//         String fileName = "EmptySpreadsheet.xls";
//         String content  = "";
//
//         MockMultipartFile mockMultipartFile = new MockMultipartFile(
//                 "emptyFile",
//                 fileName,
//                 "text/plain",
//                 content.getBytes());
         
         FileInputStream fi1 = new FileInputStream(new File("D:\\test.xlsx"));
         MockMultipartFile mockMultipartFile = new MockMultipartFile("myfile", "test.xlsx", "multipart/form-data",fi1);
         

         mockMvc.perform(MockMvcRequestBuilders.multipart("/springcommonupload2")
                 .file("myfile", mockMultipartFile.getBytes())
                 .characterEncoding("UTF-8"))
         .andExpect(MockMvcResultMatchers.status().isOk());
         
         
         
         
    }
}
