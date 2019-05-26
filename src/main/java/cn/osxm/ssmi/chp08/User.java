/**
 * @Title: User.java
 * @Package cn.osxm.ssmi.chp08
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月26日 上午8:51:15
 * @version V1.0
 */

package cn.osxm.ssmi.chp08;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

/**
 * @ClassName: User
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class User {
	private String name;

	//@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date birthDay;

	public User() {

	}

	public User(String name, Date birthDay) {
		this.name = name;
		this.birthDay = birthDay;
	}

	@NumberFormat(pattern = "#,###.###")
	private long salary;

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
