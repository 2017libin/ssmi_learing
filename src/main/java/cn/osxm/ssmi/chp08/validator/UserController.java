/**
 * @Title: UserController.java
 * @Package cn.osxm.ssmi.chp08.validator
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��6��1�� ����10:26:51
 * @version V1.0
 */

package cn.osxm.ssmi.chp08.validator;


import java.util.List;

import javax.validation.constraints.NotBlank;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.osxm.ssmi.chp08.User;
/**
  * @ClassName: UserController
  * @Description: TODO
  * @author osxm:oscarxueming
  */
@Controller
@Validated
public class UserController {

    
    @RequestMapping("/getUser") 
    public User get(@NotBlank(message = "User name must not Blank") @RequestParam("name") String name) {
        User user = new User();
        user.setAge(180);
        return user;
    }
   
    
    @RequestMapping("/saveUser") 
    public User save(@Validated User user,BindingResult bindingResult) {
		List<ObjectError> list = bindingResult.getAllErrors(); // �õ��󶨵Ľ�������д���
		for (ObjectError objectError : list) {
			FieldError fe = (FieldError) objectError;
			System.out.println(fe.getField()); // ���������, age
			System.out.println(fe.getRejectedValue()); // �����ֵ,180
			System.out.println(fe.getCode()); // ������,Max
		}
        return user;
    }
}
