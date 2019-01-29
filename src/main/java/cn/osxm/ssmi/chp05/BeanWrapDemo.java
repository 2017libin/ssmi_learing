/**
 * @Title: BeanWrapDemo.java
 * @Package cn.osxm.ssmi.chp5
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018年12月4日 下午9:51:54
 * @version V1.0
 */

package cn.osxm.ssmi.chp05;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

/**
 * @ClassName: BeanWrapDemo
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class BeanWrapDemo {
	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 */

	public static void main(String[] args) {
		// 1. 封装 School对象
		BeanWrapper school = new BeanWrapperImpl(new School());
		// setting the School name..
		school.setPropertyValue("name", "宇宙中学");
		// ... can also be done like this:
		// PropertyValue value = new PropertyValue("name", "Some Company Inc.");
		// company.setPropertyValue(value);

		// 2. 封装 Teacher对象
		BeanWrapper teacher = new BeanWrapperImpl(new Teacher());
		teacher.setPropertyValue("name", "张三");
		teacher.setPropertyValue("age", 40);

		// 3. 设置school的校长
		school.setPropertyValue("principal", teacher.getWrappedInstance());

		// 4. 获取使用
		String name = (String) school.getPropertyValue("principal.name");
		System.out.println(name);
	}
}
