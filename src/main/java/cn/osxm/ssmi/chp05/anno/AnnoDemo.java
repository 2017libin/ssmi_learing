/**
 * @Title: AnnoDemo.java
 * @Package cn.osxm.ssmi.chp05.anno
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年3月9日 上午6:09:58
 * @version V1.0
 */

package cn.osxm.ssmi.chp05.anno;

import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor;
import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;
import org.springframework.orm.jpa.support.PersistenceAnnotationBeanPostProcessor;

/**
 * @ClassName: AnnoDemo
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class AnnoDemo {

	/**
	  * @Title: main
	  * @Description: TODO
	  * @param args
	  */

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		CommonAnnotationBeanPostProcessor c;
		PersistenceAnnotationBeanPostProcessor p;
		AutowiredAnnotationBeanPostProcessor a;
		RequiredAnnotationBeanPostProcessor r;

	}

}
