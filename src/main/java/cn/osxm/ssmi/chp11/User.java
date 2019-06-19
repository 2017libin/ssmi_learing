/**
 * @Title: User.java
 * @Package cn.osxm.ssmi.chp11
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年6月19日 下午11:17:20
 * @version V1.0
 */

package cn.osxm.ssmi.chp11;

import java.io.Serializable;

/**
  * @ClassName: User
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class User  implements Serializable {
	/**
	  * @Fields serialVersionUID : TODO
	  */
	
	private static final long serialVersionUID = 1L;



	private int id;



    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

