/**
 * @Title: BeanWrapDemo.java
 * @Package cn.osxm.ssmi.chp5
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018��12��4�� ����9:51:54
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
		// 1. ��װ School����
		BeanWrapper school = new BeanWrapperImpl(new School());
		// setting the School name..
		school.setPropertyValue("name", "������ѧ");
		// ... can also be done like this:
		// PropertyValue value = new PropertyValue("name", "Some Company Inc.");
		// company.setPropertyValue(value);

		// 2. ��װ Teacher����
		BeanWrapper teacher = new BeanWrapperImpl(new Teacher());
		teacher.setPropertyValue("name", "����");
		teacher.setPropertyValue("age", 40);

		// 3. ����school��У��
		school.setPropertyValue("principal", teacher.getWrappedInstance());

		// 4. ��ȡʹ��
		String name = (String) school.getPropertyValue("principal.name");
		System.out.println(name);
	}
}
