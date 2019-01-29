/**
 * @Title: BeanAnno.java
 * @Package cn.osxm.ssmi.chp4.anno
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��1��21�� ����10:23:24
 * @version V1.0
 */

package cn.osxm.ssmi.chp04.anno;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import cn.osxm.ssmi.com.User;

/**
 * @ClassName: BeanAnno
 * @Description: TODO
 * @author osxm:oscarxueming
 */
@Component
public class BeanAnno {

	//Ĭ��bean�����־��Ƿ�����
	@Bean
	@Order(3)
	public User firstUser() {
		return new User("first");
	}
	//@Primary��ע����ʹ�õ�
	@Bean
	@Primary
	@Order(2)
	public User secondUser() {
		return new User("second");
	}
	
	@Bean(name="thirdUser")
	@Order(1)
	public User thirdUser() {
		return new User("third");
	}
}
