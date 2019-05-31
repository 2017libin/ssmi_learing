/**
 * @Title: UserValidator.java
 * @Package cn.osxm.ssmi.chp08.validator
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��5��18�� ����10:23:34
 * @version V1.0
 */

package cn.osxm.ssmi.chp08.validator;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import cn.osxm.ssmi.chp08.User;



/**
 * @ClassName: UserValidator
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class UserValidator implements Validator {
	

	
	@Override
	public boolean supports(Class<?> clazz) {
		return User.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		User u = (User) target;
		if (u.getAge() < 0) {
			errors.rejectValue("age", "�Ƿ�������ֵ");
		} else if (u.getAge() > 100) {
			errors.rejectValue("age", "̫����");
		}
	}
}
