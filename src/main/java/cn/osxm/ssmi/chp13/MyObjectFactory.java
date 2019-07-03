/**
 * @Title: MyObjectFactory.java
 * @Package cn.osxm.ssmi.chp13
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年7月3日 下午8:55:26
 * @version V1.0
 */

package cn.osxm.ssmi.chp13;
import java.util.Collection;
import java.util.Properties;

import org.apache.ibatis.reflection.factory.DefaultObjectFactory;

import cn.osxm.ssmi.com.User;
/**
  * @ClassName: MyObjectFactory
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class MyObjectFactory extends DefaultObjectFactory {

    // 处理默认构造方法
    @Override
    public Object create(Class type) {
        if (type.equals(User.class)) {
            User user = (User) super.create(type);
            user.setCountry("中国");
            return user;
        }
        return super.create(type);
    }
}