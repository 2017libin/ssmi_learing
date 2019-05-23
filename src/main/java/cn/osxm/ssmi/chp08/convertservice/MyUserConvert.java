/**
 * @Title: MyUserConvert.java
 * @Package cn.osxm.ssmi.chp08.convertservice
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月22日 下午10:07:05
 * @version V1.0
 */

package cn.osxm.ssmi.chp08.convertservice;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

import cn.osxm.ssmi.chp08.propertyeditor.User;
/**
  * @ClassName: MyUserConvert
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class MyUserConvert implements Converter<String, User>{
	@Override
    public User convert(String source){
        String[] strArray = source.split(",");       
        User user = new User();
        user.setName(strArray[0]);
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        Date birthDay = null;
	    try {
			birthDay = format.parse(strArray[1]);
		} catch (ParseException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        user.setBirthDay(birthDay);
        return user;
    }
}
