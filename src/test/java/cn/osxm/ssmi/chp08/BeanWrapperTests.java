/**
 * @Title: BeanWrapperTests.java
 * @Package cn.osxm.ssmi.chp08
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月24日 上午5:54:05
 * @version V1.0
 */

package cn.osxm.ssmi.chp08;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.format.support.DefaultFormattingConversionService;

import cn.osxm.ssmi.chp08.propertyeditor.User;

/**
  * @ClassName: BeanWrapperTests
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class BeanWrapperTests {

	@Test
	public void beanWrapperWithConvertService() {
		User user = new User();
		BeanWrapperImpl userWrapper = new BeanWrapperImpl(user); 
		DefaultFormattingConversionService conversionService = new DefaultFormattingConversionService();  
		userWrapper.setConversionService(conversionService);
		userWrapper.setPropertyValue("birthDay", "2019+06+10");
		Date date = (Date) userWrapper.getPropertyValue("birthDay");
		System.out.println(date);
	}
}
