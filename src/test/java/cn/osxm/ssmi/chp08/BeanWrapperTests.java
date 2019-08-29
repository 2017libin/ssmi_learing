/**
 * @Title: BeanWrapperTests.java
 * @Package cn.osxm.ssmi.chp08
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月24日 上午5:54:05
 * @version V1.0
 */

package cn.osxm.ssmi.chp08;

import org.junit.Test;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.format.support.DefaultFormattingConversionService;

/**
  * @ClassName: BeanWrapperTests
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class BeanWrapperTests {

	@Test
    public void formattingConversionServiceWithBeanWrapper(){
        User user = new User();
        BeanWrapperImpl fooWrapper = new BeanWrapperImpl(user);
      
        //DefaultConversionService conversionService = new DefaultConversionService();
        //fooWrapper.setConversionService(conversionService);
        DefaultFormattingConversionService conversionService= new DefaultFormattingConversionService();
        fooWrapper.setConversionService(conversionService);
        fooWrapper.setPropertyValue("name", "User 1");
        //fooWrapper.setPropertyValue("birthDay", "2019/05/10"); //default
        fooWrapper.setPropertyValue("birthDay", "2019-05-10");
        Object nameValue = fooWrapper.getPropertyValue("name");   
        Object birthDayValue = fooWrapper.getPropertyValue("birthDay");  

        System.out.println(nameValue);
        System.out.println(birthDayValue);
    }
}
