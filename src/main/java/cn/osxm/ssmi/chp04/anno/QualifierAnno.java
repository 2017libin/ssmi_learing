/**
 * @Title: QualifierAnno.java
 * @Package cn.osxm.ssmi.chp4.anno
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月21日 下午10:41:38
 * @version V1.0
 */

package cn.osxm.ssmi.chp04.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import cn.osxm.ssmi.com.User;

/**
  * @ClassName: QualifierAnno
  * @Description: TODO
  * @author osxm:oscarxueming
  */
@Component
public class QualifierAnno {

	@Autowired
	//@Qualifier("thirdUser")
	@Qualifier(value="thirdUser")
	private User user;

	public User getUser() {
		return user;
	}
}
