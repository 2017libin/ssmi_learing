/**
 * @Title: UserEventListener.java
 * @Package cn.osxm.ssmi.chp04.aware
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年2月7日 上午7:50:10
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
        //监听注册成功后的处理
		System.out.println("注册成功后发送邮件： " + event.getUser().getName());
	}

}
