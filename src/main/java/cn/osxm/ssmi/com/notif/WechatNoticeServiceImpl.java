/**
 * @Title: WechatNoticeServiceImpl.java
 * @Package cn.osxm.ssmi.com.notif
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��1��30�� ����5:51:09
 * @version V1.0
 */

package cn.osxm.ssmi.com.notif;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @ClassName: WechatNoticeServiceImpl
 * @Description: TODO
 * @author osxm:oscarxueming
 */
@Component
@Primary
public class WechatNoticeServiceImpl implements NoticeService {

	@Override
	public void send(String message) {
		System.out.println("���䷢����Ϣ");
	}

}
