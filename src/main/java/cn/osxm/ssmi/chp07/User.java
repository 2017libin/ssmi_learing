/**
 * @Title: User.java
 * @Package cn.osxm.ssmi.chp7
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018年12月25日 上午6:22:12
 * @version V1.0
 */

package cn.osxm.ssmi.chp07;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import com.fasterxml.jackson.annotation.JsonView;

/**
 * @ClassName: User
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class User {
	public interface WithoutNameView {
	};

	public interface WithNameView extends WithoutNameView {
	};

	private String id;

	@NotNull(message = "name is not null")
	private String name;

	//@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date birthDay;

	@NumberFormat(pattern = "#,###,###.#")
	private Float salary;

	public User() {

	}

	public User(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@JsonView(WithoutNameView.class)
	public String getId() {

		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@JsonView(WithNameView.class)
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

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}
}
