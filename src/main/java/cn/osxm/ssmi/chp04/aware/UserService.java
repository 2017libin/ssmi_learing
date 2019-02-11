/**
 * @Title: ImplApplicationEventPublisherAware.java
 * @Package cn.osxm.ssmi.chp04.aware
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��2��6�� ����5:17:45
 * @version V1.0
 */

package cn.osxm.ssmi.chp04.aware;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * @ClassName: ImplApplicationEventPublisherAware
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class UserService implements ApplicationEventPublisherAware {

	private ApplicationEventPublisher applicationEventPublisher;

	/**
	 * Title: setApplicationEventPublisher Description:
	 * 
	 * @param applicationEventPublisher
	 * @see org.springframework.context.ApplicationEventPublisherAware#setApplicationEventPublisher(org.springframework.context.ApplicationEventPublisher)
	 */

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;
	}

	public boolean register(User user) {
		// �û�ע�ᴦ�� �������ݿ�Ȳ���
		System.out.println("�û�[" + user + "]ע��ɹ���");

		// ��Ϣ�¼�����
		applicationEventPublisher.publishEvent(new UserRegisterEvent(this, user));
		return true;
	}

}
