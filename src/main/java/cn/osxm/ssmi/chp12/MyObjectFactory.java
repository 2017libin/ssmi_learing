/**
 * @Title: MyObjectFactory.java
 * @Package cn.osxm.ssmi.chp12
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年2月15日 下午10:23:45
 * @version V1.0
 */

package cn.osxm.ssmi.chp12;

import java.util.Collection;
import java.util.List;
import java.util.Properties;

import org.apache.ibatis.reflection.factory.DefaultObjectFactory;


/**
  * @ClassName: MyObjectFactory
  * @Description: TODO
  * @author osxm:oscarxueming
  */
public class MyObjectFactory extends DefaultObjectFactory {
    public Object create(Class type) {
        return super.create(type);
    }

//    public Object create(Class type, List<Class> constructorArgTypes, List<Object> constructorArgs) {
//        return super.create(type, constructorArgTypes, constructorArgs);
//    }

    public void setProperties(Properties properties) {
        super.setProperties(properties);
    }

    public <T> boolean isCollection(Class<T> type) {
        return Collection.class.isAssignableFrom(type);
    }
}

