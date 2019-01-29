/**
 * @Title: MailNoticeServiceImpl.java
 * @Package cn.osxm.ssmi.com.notif
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月30日 上午5:50:39
 * @version V1.0
 */

package cn.osxm.ssmi.com.notif;

/**
 * @ClassName: MailNoticeServiceImpl
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class MailNoticeServiceImpl implements NoticeService {

	@Override
	public void send(String message) {
		System.out.println("微信发送信息");
	}

}
