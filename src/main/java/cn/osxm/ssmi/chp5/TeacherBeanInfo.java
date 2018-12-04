/**
 * @Title: TeacherBeanInfo.java
 * @Package cn.osxm.ssmi.chp5
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018年12月4日 下午9:54:19
 * @version V1.0
 */

package cn.osxm.ssmi.chp5;

import java.beans.SimpleBeanInfo;

/**
 * @ClassName: TeacherBeanInfo
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class TeacherBeanInfo extends SimpleBeanInfo {

	/*
	 * public PropertyDescriptor[] getPropertyDescriptors() { try { final
	 * PropertyEditor numberPE = new CustomNumberEditor(Integer.class, true);
	 * PropertyDescriptor ageDescriptor = new PropertyDescriptor("age",
	 * Teacher.class) { public PropertyEditor createPropertyEditor(Object bean) {
	 * return numberPE; }; }; return new PropertyDescriptor[] { ageDescriptor }; }
	 * catch (IntrospectionException ex) { throw new Error(ex.toString()); } }
	 */
}
