/**
 * @Title: School.java
 * @Package cn.osxm.ssmi.chp5
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018年12月4日 下午9:53:10
 * @version V1.0
 */

package cn.osxm.ssmi.chp05;

/**
 * @ClassName: School
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class School {
	private String name;

	private Teacher principal;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Teacher getPrincipal() {
		return principal;
	}

	public void setPrincipal(Teacher principal) {
		this.principal = principal;
	}
}
