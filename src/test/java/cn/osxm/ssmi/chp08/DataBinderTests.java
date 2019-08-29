/**
 * @Title: DataBinderTests.java
 * @Package cn.osxm.ssmi.chp08
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月26日 下午9:57:13
 * @version V1.0
 */

package cn.osxm.ssmi.chp08;

import org.junit.Test;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;

/**
  * @ClassName: DataBinderTests
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class DataBinderTests {

	@Test
	public void dataBinderTest() {
		User user = new User();
		DataBinder dataBinder = new DataBinder(user, user.getClass().getName());
		//dataBinder.addCustomFormatter(new  MyDateFormatter());
		//dataBinder.registerCustomEditor(Date.class, "birthDay", new MyDatePropertyEditor());
		dataBinder.addCustomFormatter(new  DateFormatter("yyyy-MM-dd"));
		//dataBinder.registerCustomEditor(Date.class, new MyDatePropertyEditor());
		MutablePropertyValues propertyValues= new MutablePropertyValues();
		propertyValues.add("name", "Zhang San");
		//propertyValues.add("birthDay", "2019/06/10");
		propertyValues.add("birthDay", "2019-06-10");
		dataBinder.bind(propertyValues);
		BindingResult bindingResult = dataBinder.getBindingResult();
		user = (User) bindingResult.getTarget();
		System.out.println(user.getBirthDay());
		//Date date = (Date) bindingResult.getFieldValue("birthDay");
		//System.out.println(date);
	}
}
