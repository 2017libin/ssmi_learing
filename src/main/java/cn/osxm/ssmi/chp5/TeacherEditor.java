/**
 * @Title: TeacherEditor.java
 * @Package cn.osxm.ssmi.chp5
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018年12月4日 下午9:54:48
 * @version V1.0
 */

package cn.osxm.ssmi.chp5;

import java.beans.PropertyEditorSupport;

/**
 * @ClassName: TeacherEditor
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class TeacherEditor extends PropertyEditorSupport {

	public void setAsText(String text) {
		if (text == null || text.indexOf(",") == -1) {
			throw new IllegalArgumentException("String format is invalid!");
		}
		String[] infos = text.split(",");
		Teacher teacher = new Teacher();
		teacher.setName(infos[0]);
		teacher.setAge(infos[1]);
		setValue(teacher);
	}
}
