/**
 * @Title: User.java
 * @Package cn.osxm.ssmi.chp08.propertyeditor
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月17日 下午9:47:53
 * @version V1.0
 */

package cn.osxm.ssmi.chp08.propertyeditor;

import java.util.Date;

/**
 * @ClassName: User
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class User {
	private String name;
	
	@DateTimeFormat
	private Date birthDay;
	public String getName() {
	
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthDay() {
	
		return birthDay;
	}
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
}
