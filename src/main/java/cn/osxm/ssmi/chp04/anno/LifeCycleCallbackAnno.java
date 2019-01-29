/**
 * @Title: LifeCycleCallbackAnno.java
 * @Package cn.osxm.ssmi.chp4.anno
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月20日 上午8:11:06
 * @version V1.0
 */

package cn.osxm.ssmi.chp04.anno;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @ClassName: LifeCycleCallbackAnno
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class LifeCycleCallbackAnno {

	@PostConstruct
	public void startAnno() {

	}

	@PreDestroy
	public void endAnno() {

	}
}
