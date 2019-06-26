/**
 * @Title: FileUploadTests.java
 * @Package cn.osxm.ssmi.chp10
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年6月27日 上午6:03:03
 * @version V1.0
 */

package cn.osxm.ssmi.chp10;

import java.io.File;
import java.io.FileInputStream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * @ClassName: FileUploadTests
 * @Description: TODO
 * @author osxm:oscarxueming
 */
@SpringJUnitWebConfig(locations = { "classpath:cn/osxm/ssmi/chp09/file-upload.xml" })
public class FileUploadTests {
	private static MockMvc mockMvc;

	@BeforeAll
	static void setup(WebApplicationContext wac) {
		mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}

	@Test
	public void uploadbyBytes() throws Exception {
		byte[] fileBytes = new String("File Content").getBytes();
		mockMvc.perform(MockMvcRequestBuilders.multipart("/springCommonFileUpload").file("myfile", fileBytes)
				.characterEncoding("UTF-8")).andExpect(MockMvcResultMatchers.status().isOk());
	}

	// @Test
	public void uploadbyMockFile() throws Exception {
		// FileInputStream fi1 = new FileInputStream(new File("D:\\test.xlsx"));
		FileInputStream fi1 = new FileInputStream(new File("test.xlsx"));
		MockMultipartFile mockMultipartFile = new MockMultipartFile("myfile", "test.xlsx", "multipart/form-data", fi1);
		mockMvc.perform(MockMvcRequestBuilders.multipart("/springCommonFileUpload").file(mockMultipartFile))
				.andExpect(MockMvcResultMatchers.status().isOk());
	}

}
