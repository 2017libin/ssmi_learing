/**
 * @Title: SpringValidatorTests.java
 * @Package cn.osxm.ssmi.chp08
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��5��31�� ����10:06:10
 * @version V1.0
 */

package cn.osxm.ssmi.chp08;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

/**
 * @ClassName: SpringValidatorTests
 * @Description: TODO
 * @author osxm:oscarxueming
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:cn/osxm/ssmi/chp08/validator.xml")
public class SpringValidatorTests {
	
	@Autowired
	private LocalValidatorFactoryBean validatorFactory;
	
	@Autowired
	private ApplicationContext applicationContext;

	@SuppressWarnings("unused")
	@Autowired
	private User user;
	
	
	@Test
	public void dataBindValid() {
		User user = new User();
		user.setName("Zhang San");
		user.setAge(120);
		DataBinder dataBinder = new DataBinder(user);	
		//dataBinder.addValidators(new UserValidator());
		dataBinder.addValidators(validatorFactory);
		dataBinder.validate();
		BindingResult bindingResult = dataBinder.getBindingResult();
		List<ObjectError> list = bindingResult.getAllErrors(); // �õ��󶨵Ľ�������д���
		for (ObjectError objectError : list) {
			FieldError fe = (FieldError) objectError;
			System.out.println(fe.getField()); // ������λ
			System.out.println(fe.getRejectedValue()); // �����ֵ
			System.out.println(fe.getCode()); // ������
		}
	}
	
	//@Test
	public void jsrSpringValid() {
		LocalValidatorFactoryBean validatorFactory = (LocalValidatorFactoryBean) applicationContext.getBean("validatorFactory");
		javax.validation.Validator validator = validatorFactory.getValidator();
		User user = new User();
		user.setName("Zhang San");
		user.setAge(120);
		Set<ConstraintViolation<User>>  violations = validator.validate(user);
        for (ConstraintViolation<User> data : violations) {
            System.out.println(data.getPropertyPath().toString() + ":" + data.getMessage());
        }
		System.out.println(user.getAge());
	}
}
