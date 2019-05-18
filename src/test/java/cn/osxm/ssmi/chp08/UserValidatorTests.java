/**
 * @Title: UserValidatorTests.java
 * @Package cn.osxm.ssmi.chp08
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��5��18�� ����5:37:00
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
        DataBinder db = new DataBinder(user, user.getClass().getName()); //���ݰ�
        db.setValidator(new UserValidator()); //�����֤��
        db.validate(); //������֤
        BindingResult br = db.getBindingResult(); //�õ��󶨵Ľ��
        //System.out.println(br);
        List<ObjectError> list = br.getAllErrors(); //�õ��󶨵Ľ�������д���
        for (ObjectError objectError : list) {
            FieldError fe = (FieldError)objectError;
            System.out.println(fe.getField()); //������λ
            System.out.println(fe.getRejectedValue()); //�����ֵ
            System.out.println(fe.getCode());  //������
        }
    }

}
