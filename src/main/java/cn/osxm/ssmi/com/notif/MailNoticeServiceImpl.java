/**
 * @Title: MailNoticeServiceImpl.java
 * @Package cn.osxm.ssmi.com.notif
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��1��30�� ����5:50:39
 * @version V1.0
 */

package cn.osxm.ssmi.com.notif;

import org.springframework.stereotype.Component;

/**
 * @ClassName: MailNoticeServiceImpl
 * @Description: TODO
 * @author osxm:oscarxueming
 */
@Component
public class MailNoticeServiceImpl implements NoticeService {

	@Override
	public void send(String message) {
		System.out.println("΢�ŷ�����Ϣ");
	}

}
