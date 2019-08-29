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

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.NumberFormat;

/**
 * @ClassName: User
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class User {
	@NotNull
	private String name;

	// @DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date birthDay;

	@Max(100)
	private int age;

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

	public int getAge() {

		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
