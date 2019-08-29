/**
 * @Title: SpringValidatorTests.java
 * @Package cn.osxm.ssmi.chp08
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月31日 下午10:06:10
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
		List<ObjectError> list = bindingResult.getAllErrors(); // 得到绑定的结果的所有错误
		for (ObjectError objectError : list) {
			FieldError fe = (FieldError) objectError;
			System.out.println(fe.getField()); // 错误栏位
			System.out.println(fe.getRejectedValue()); // 错误的值
			System.out.println(fe.getCode()); // 错误吗
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
