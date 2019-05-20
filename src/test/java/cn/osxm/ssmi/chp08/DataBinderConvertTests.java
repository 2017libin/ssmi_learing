/**
 * @Title: DataBinderConvertTests.java
 * @Package cn.osxm.ssmi.chp08
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��5��18�� ����5:35:03
 * @version V1.0
 */

package cn.osxm.ssmi.chp08;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.format.Formatter;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.testng.Assert;

import cn.osxm.ssmi.chp08.databinder.MyDatePropertyEditor;
import cn.osxm.ssmi.com.User;

/**
 * @ClassName: DataBinderConvertTests
 * @Description: TODO
 * @author osxm:oscarxueming
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:cn/osxm/ssmi/chp08/data-bind-convert.xml")
public class DataBinderConvertTests {
	
	@Autowired
	private DefaultConversionService defaultConversionService;
	
	//@Test
	public void springPropertyEditorTest() {
		CustomDateEditor  customDateEditor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), false);
		customDateEditor.setAsText("2019-06-10");
		Date date = (Date) customDateEditor.getValue();
		System.out.println(date);
	}
	
	
	// @Test
	public void beanWrapTest() throws ParseException {
		User user = new User();
		BeanWrapperImpl userWrapper = new BeanWrapperImpl(user);
		// userWrapper.registerCustomEditor(Date.class, new MyDatePropertyEditor());
		userWrapper.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), false));
		userWrapper.setPropertyValue("name", "User 1");
		userWrapper.setPropertyValue("birthDay", "2019-06-10");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Object nameValue = userWrapper.getPropertyValue("name");
		Object birthDayValue = userWrapper.getPropertyValue("birthDay");
		Assert.assertEquals(nameValue, "User 1");
		Assert.assertEquals(birthDayValue, format.parse("2019-05-10"));
	}
	
	
	
	@Test
	public void conversionTest() {
		List list = defaultConversionService.convert("1,2,3,4,5", List.class);
		System.out.println(list);
		TimeZone timeZone = defaultConversionService.convert("2019-06-10", TimeZone.class);
		System.out.println(timeZone);
	}

	//@Test
	public void dataBinderTest() {
		User user = new User();
		user.setName("User 1");
		DataBinder dataBinder = new DataBinder(user, user.getClass().getName());
		dataBinder.addCustomFormatter(new DateFormatter("yyyy-MM-dd"));
		BindingResult bindingResult = dataBinder.getBindingResult();
		Object nameValue = bindingResult.getFieldValue("name");
		Assert.assertEquals(nameValue, "User 1");
	}
}
