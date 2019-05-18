/**
 * @Title: User.java
 * @Package cn.osxm.ssmi.chp08.validator
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月18日 下午10:23:13
 * @version V1.0
 */

package cn.osxm.ssmi.chp08.validator;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

/**
  * @ClassName: User
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class User {
	 @NotNull
	    private String name;

	    @Max(0)
	    @Max(120)
	    private int age;

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }
}
