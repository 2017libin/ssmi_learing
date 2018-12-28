/**
 * @Title: UserEntity.java
 * @Package cn.osxm.ssmi.chp10
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018年12月28日 下午10:15:06
 * @version V1.0
 */

package cn.osxm.ssmi.chp10.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @ClassName: UserEntity
 * @Description: TODO
 * @author osxm:oscarxueming
 */
@Entity(name="user")
public class UserEntity {
	private int id;
	private String name;

	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(length = 12)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
