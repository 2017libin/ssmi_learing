/**
 * @Title: DataBinderConvertTests.java
 * @Package cn.osxm.ssmi.chp08
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月18日 下午5:35:03
 * @version V1.0
 */

package cn.osxm.ssmi.chp08;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.format.Formatter;
import org.springframework.format.datetime.DateFormatter;
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

public class DataBinderConvertTests {
	// @Test
	public void beanWrapTest() throws ParseException {
		User user = new User();
		BeanWrapperImpl fooWrapper = new BeanWrapperImpl(user);
		// fooWrapper.registerCustomEditor(Date.class, new MyDatePropertyEditor());
		fooWrapper.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), false));
		fooWrapper.setPropertyValue("name", "User 1");
		fooWrapper.setPropertyValue("birthDay", "2019-05-10");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Object nameValue = fooWrapper.getPropertyValue("name");
		Object birthDayValue = fooWrapper.getPropertyValue("birthDay");
		Assert.assertEquals(nameValue, "User 1");
		Assert.assertEquals(birthDayValue, format.parse("2019-05-10"));
	}

	@Test
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
