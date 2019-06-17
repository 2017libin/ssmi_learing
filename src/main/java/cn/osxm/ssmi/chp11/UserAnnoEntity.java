/**
 * @Title: UserAnnoEntity.java
 * @Package cn.osxm.ssmi.chp10
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018年12月30日 上午7:05:28
 * @version V1.0
 */

package cn.osxm.ssmi.chp11;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
  * @ClassName: UserAnnoEntity
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class UserAnnoEntity {
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
