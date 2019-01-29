/**
 * @Title: MyContextLoader.java
 * @Package cn.osxm.ssmi.chp6.testanno
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月30日 上午4:56:56
 * @version V1.0
 */

package cn.osxm.ssmi.chp06.testanno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfigurationAttributes;
import org.springframework.test.context.MergedContextConfiguration;
import org.springframework.test.context.SmartContextLoader;

/**
  * @ClassName: MyContextLoader
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class MyContextLoader implements SmartContextLoader{

    @Override
    public String[] processLocations(Class<?> clazz, String... locations) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ApplicationContext loadContext(String... locations) throws Exception {
        // TODO Auto-generated method stub
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:cn/osxm/ssmi/chp6/applicationContext.xml");
        return context;
    }

    @Override
    public void processContextConfiguration(ContextConfigurationAttributes configAttributes) {
        String[] processedLocations =
                processLocations(configAttributes.getDeclaringClass(), configAttributes.getLocations());
        configAttributes.setLocations(processedLocations);
    }

    @Override
    public ApplicationContext loadContext(MergedContextConfiguration mergedConfig) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

}


