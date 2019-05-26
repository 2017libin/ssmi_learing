/**
 * @Title: MyDataConvert.java
 * @Package cn.osxm.ssmi.chp08.convertservice
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月26日 下午5:23:06
 * @version V1.0
 */

package cn.osxm.ssmi.chp08.convertservice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;


/**
 * @ClassName: MyDataConvert
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class MyDateConvert implements Converter<String, Date> {

	@Override
	public Date convert(String source) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = format.parse(source);
		} catch (ParseException e) {			
			e.printStackTrace();
		}
		return date;
	}
}
