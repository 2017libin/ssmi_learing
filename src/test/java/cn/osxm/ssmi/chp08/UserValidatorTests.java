/**
 * @Title: UserValidatorTests.java
 * @Package cn.osxm.ssmi.chp08
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月18日 下午5:37:00
 * @version V1.0
 */

package cn.osxm.ssmi.chp08;

import java.util.List;

import org.junit.Test;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;

import cn.osxm.ssmi.chp08.validator.UserValidator;
import cn.osxm.ssmi.com.User;
/**
  * @ClassName: UserValidatorTests
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class UserValidatorTests {
	   //@Test
    public void validate() {

        User user = new User();
        user.setAge(120);
        DataBinder db = new DataBinder(user, user.getClass().getName()); //数据绑定
        db.setValidator(new UserValidator()); //设计验证器
        db.validate(); //进行验证
        BindingResult br = db.getBindingResult(); //得到绑定的结果
        //System.out.println(br);
        List<ObjectError> list = br.getAllErrors(); //得到绑定的结果的所有错误
        for (ObjectError objectError : list) {
            FieldError fe = (FieldError)objectError;
            System.out.println(fe.getField()); //错误栏位
            System.out.println(fe.getRejectedValue()); //错误的值
            System.out.println(fe.getCode());  //错误吗
        }
    }

}
