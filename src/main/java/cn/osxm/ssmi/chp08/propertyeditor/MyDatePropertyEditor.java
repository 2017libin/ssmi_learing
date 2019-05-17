/**
 * @Title: MyDatePropertyEditor.java
 * @Package cn.osxm.ssmi.chp08.propertyeditor
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月17日 下午9:53:16
 * @version V1.0
 */

package cn.osxm.ssmi.chp08.propertyeditor;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName: MyDatePropertyEditor
 * @Description: TODO
 * @author osxm:oscarxueming
 */
public class MyDatePropertyEditor extends PropertyEditorSupport {
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = format.parse(text);
		} catch (ParseException e) {
		}
		setValue(date);
	}
}
