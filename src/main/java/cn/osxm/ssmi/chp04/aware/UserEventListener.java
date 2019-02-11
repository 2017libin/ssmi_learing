/**
 * @Title: UserEventListener.java
 * @Package cn.osxm.ssmi.chp04.aware
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��2��7�� ����7:50:10
 * @version V1.0
 */

package cn.osxm.ssmi.chp04.aware;

import org.springframework.context.ApplicationListener;

/**
  * @ClassName: UserEventListener
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class UserEventListener implements ApplicationListener<UserRegisterEvent> {

	@Override
	public void onApplicationEvent(UserRegisterEvent event) {
        //����ע��ɹ���Ĵ���
		System.out.println("ע��ɹ������ʼ��� " + event.getUser().getName());
	}

}
