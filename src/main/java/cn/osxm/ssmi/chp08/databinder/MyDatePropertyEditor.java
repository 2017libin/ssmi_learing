/**
 * @Title: MyDatePropertyEditor.java
 * @Package cn.osxm.ssmi.chp08.databinder
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月18日 下午5:42:33
 * @version V1.0
 */

package cn.osxm.ssmi.chp08.databinder;
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
}
