/**
 * @Title: JpaDemo.java
 * @Package cn.osxm.ssmi.chp10.jpa
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018年12月29日 上午6:37:25
 * @version V1.0
 */

package cn.osxm.ssmi.chp10.jpa;

import java.util.List;

/**
  * @ClassName: JpaDemo
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class JpaDemo {

	/**
	  * @Title: main
	  * @Description: TODO
	  * @param args
	  */

	public static void main(String[] args) {
		UserDao userDao =  new UserDao();
		List<UserEntity> userList = (List<UserEntity>) userDao.findAll();
        for(UserEntity user:userList)
        {
        	System.out.println(user.getName());
        }
	}

}
