/**
 * @Title: MyDatePropertyEditor.java
 * @Package cn.osxm.ssmi.chp08.databinder
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月18日 下午5:42:33
 * @version V1.0
 */

package cn.osxm.ssmi.chp08.propertyeditor;

import java.beans.PropertyEditorSupport;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.PropertyEditorRegistry;

/**
 * @ClassName: MyDatePropertyEditor
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class MyDatePropertyEditor extends PropertyEditorSupport 
//implements PropertyEditorRegistrar 
{
	@Override
	public String getAsText() {
		Date date = (Date) getValue();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		return dateFormat.format(date);
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = null;
		try {
			date = format.parse(text);
		} catch (ParseException e) {
			format = new SimpleDateFormat("yyyy-MM-dd");
			try {
				date = format.parse(text);
			} catch (ParseException e1) {
			}
		}
		setValue(date);
	}

	//@Override
	public void registerCustomEditors(PropertyEditorRegistry registry) {
		registry.registerCustomEditor(Date.class, this);

	}
}
