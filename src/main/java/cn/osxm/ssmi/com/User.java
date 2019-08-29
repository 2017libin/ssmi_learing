/**
 * @Title: User.java
 * @Package cn.osxm.ssmi.com
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月14日 下午9:53:42
 * @version V1.0
 */

package cn.osxm.ssmi.com;

import java.io.Serializable;

/**
 * @ClassName: User
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class User implements Serializable {
	  private static final long serialVersionUID = 5041799435667583775L;

	    private int id;

	    private String name;

	    private int deptId;

	    private int age;

	    private String email;

	    private String country;

	    public User() {

	    }

	    public User(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    public User(int id, String name, String email) {
	        this.id = id;
	        this.name = name;
	        this.email = email;
	    }

	    public int getId() {

	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public User(String name) {
	        this.name = name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getDeptId() {
	        return deptId;
	    }

	    public void setDeptId(int deptId) {
	        this.deptId = deptId;
	    }

	    public int getAge() {

	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getCountry() {
	        return country;
	    }

	    public void setCountry(String country) {
	        this.country = country;
	    }

	    // use by method component, @Bean注解的属性 initMethod
	    public void userInit() {
	        System.out.println("Method user() Bean: initMethod");
	    }

	    public void userDestroy() {
	        System.out.println("Method user() Bean: destroyMethod");
	    }
}
