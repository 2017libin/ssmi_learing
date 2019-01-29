/**
 * @Title: PrimaryAnno.java
 * @Package cn.osxm.ssmi.chp4.anno
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月26日 上午5:52:06
 * @version V1.0
 */

package cn.osxm.ssmi.chp04.anno;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import cn.osxm.ssmi.chp04.anno.notif.Notice;
import cn.osxm.ssmi.com.User;

/**
 * @ClassName: PrimaryAnno
 * @Description: TODO
 * @author osxm:oscarxueming
 */
@Component
public class PrimaryAnno {

	@Autowired
	private List<User> userList;

	@Autowired
	private User user;
	
	@Autowired
	@Qualifier("mailNotice")
	private Notice notice;

	// 测试使用
	public User getUser() {
		return user;
	}

	public List<User> getUserList() {

		return userList;
	}
}
