/**
 * @Title: FormattingConversionServiceTests.java
 * @Package cn.osxm.ssmi.chp08
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月26日 上午8:47:35
 * @version V1.0
 */

package cn.osxm.ssmi.chp08;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.format.datetime.DateFormatter;
import org.springframework.format.support.DefaultFormattingConversionService;

/**
  * @ClassName: FormattingConversionServiceTests
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class FormattingConversionServiceTests {
	  //@Test
    public void dateFormatTest() {
        DateFormatter dateFormatter=new DateFormatter();  
        dateFormatter.setPattern("yyyy/MM/dd");
        String chinaDateStr = dateFormatter.print(new Date(), Locale.CHINESE);
        String englishDateStr = dateFormatter.print(new Date(), Locale.ENGLISH);
        System.out.println(chinaDateStr); //2019/5/23
        System.out.println(englishDateStr); //2019/5/23
        
        //Locale Usage
        Date date = new Date();
        String cnDateStr = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.CHINESE).format(date);
        String enDateStr = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.ENGLISH).format(date);
        System.out.println(cnDateStr);//2019-5-23
        System.out.println(enDateStr);  //May 23, 2019
    }
    
    //@Test
    public void formattingConversionServiceTest() {
        DefaultFormattingConversionService formateConversionService = new DefaultFormattingConversionService();
        String dateStr = formateConversionService.convert(new Date(), String.class);
        System.out.println(dateStr);
    }
}
