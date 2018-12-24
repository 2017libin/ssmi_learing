/**
 * @Title: User.java
 * @Package cn.osxm.ssmi.chp7
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018年12月25日 上午6:22:12
 * @version V1.0
 */

package cn.osxm.ssmi.chp7;

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

	private String name;

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
}
