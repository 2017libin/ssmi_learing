/**
 * @Title: MyDateFormat.java
 * @Package cn.osxm.ssmi.chp08.convertservice
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月26日 下午10:14:55
 * @version V1.0
 */

package cn.osxm.ssmi.chp08.convertservice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.format.Formatter;

/**
  * @ClassName: MyDateFormat
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class MyDateFormatter implements Formatter<Date> {

	@Override
	public String print(Date object, Locale locale) {
		SimpleDateFormat  dateFormat= new SimpleDateFormat("yyyy-MM-dd", locale);
		return dateFormat.format(object);
	}

	@Override
	public Date parse(String text, Locale locale) throws ParseException {
		SimpleDateFormat  dateFormat= new SimpleDateFormat("yyyy-MM-dd", locale);
		return dateFormat.parse(text);
	}

}
