/**
 * @Title: ValidatorTests.java
 * @Package cn.osxm.ssmi.chp08
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月18日 下午5:37:29
 * @version V1.0
 */

package cn.osxm.ssmi.chp08;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;

import org.junit.Test;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import cn.osxm.ssmi.com.User;

/**
  * @ClassName: ValidatorTests
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class ValidatorTests {

    
    public void jsrValidateTest() {
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        User user = new User();
        user.setName("User 1");
        user.setAge(180);
        Set<ConstraintViolation<User>> violations = validator.validate(user);
        for (ConstraintViolation<User> data : violations) {
            System.out.println(data.getPropertyPath().toString() + ":" + data.getMessage());
        }
    }
    @Test
    public void jsrBvalValidateTest() {
        User user = new User();
        Validator validator = Validation.byProvider(org.apache.bval.jsr.ApacheValidationProvider.class).configure().buildValidatorFactory().getValidator();

        user.setName("User 1");
        user.setAge(180);
        Set<ConstraintViolation<User>> violations = validator.validate(user);
        for (ConstraintViolation<User> data : violations) {
            System.out.println(data.getPropertyPath().toString() + ":" + data.getMessage());
        }
    }
}
