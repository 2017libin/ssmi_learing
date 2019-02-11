/**
 * @Title: UserRegisterEvent.java
 * @Package cn.osxm.ssmi.chp04.aware
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��2��6�� ����5:19:52
 * @version V1.0
 */

package cn.osxm.ssmi.chp04.aware;

import org.springframework.context.ApplicationEvent;

/**
 * @ClassName: UserRegisterEvent
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class UserRegisterEvent extends ApplicationEvent {

	private static final long serialVersionUID = 1L;

	private User user;

	// Source�Ƿ���ʱ��Ķ���
	public UserRegisterEvent(Object source, User user) {
		super(source);
		this.user = user;
	}

	public User getUser() {
		return user;
	}
}
