/**
 * @Title: DemoDependOn.java
 * @Package cn.osxm.ssmi.chp4
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月7日 上午4:58:15
 * @version V1.0
 */

package cn.osxm.ssmi.chp4;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: DemoDependOn
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class DemoDependOn {

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 */

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml",
				DemoDependOn.class);
		context.close();

	}

}
