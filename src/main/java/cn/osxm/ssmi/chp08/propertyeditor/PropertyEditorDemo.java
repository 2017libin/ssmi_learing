/**
 * @Title: PropertyEditorDemo.java
 * @Package cn.osxm.ssmi.chp08.propertyeditor
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月17日 下午9:54:31
 * @version V1.0
 */

package cn.osxm.ssmi.chp08.propertyeditor;

import java.beans.PropertyEditorSupport;
import java.util.Date;

/**
  * @ClassName: PropertyEditorDemo
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class PropertyEditorDemo {

	/**
	  * @Title: main
	  * @Description: TODO
	  * @param args
	  */

	public static void main(String[] args) {
		PropertyEditorSupport dataPropertyEditor = new MyDatePropertyEditor();
		dataPropertyEditor.setAsText("2019-06-30");
		Date date = (Date) dataPropertyEditor.getValue();
		System.out.println(date);
	}

}
