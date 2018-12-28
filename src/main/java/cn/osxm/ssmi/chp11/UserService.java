/**
 * @Title: UserService.java
 * @Package cn.osxm.ssmi.chp11
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018年12月28日 下午9:33:43
 * @version V1.0
 */

package cn.osxm.ssmi.chp11;

import org.springframework.transaction.annotation.Transactional;

import cn.osxm.ssmi.chp2.User;

/**
 * @ClassName: UserService
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class UserService {
	@Transactional
	public void update(User user) {
		System.out.println("Update User");
	}
}
