/**
 * @Title: RestUserController.java
 * @Package cn.osxm.ssmi.chp09.rest
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��4��4�� ����11:00:27
 * @version V1.0
 */

package cn.osxm.ssmi.chp09.rest;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.osxm.ssmi.chp09.User;
import cn.osxm.ssmi.com.anno.UserServiceImpl;
/**
  * @ClassName: RestUserController
  * @Description: TODO
  * @author osxm:oscarxueming
  */

@RestController
public class RestUserController {

	 public List<User> userList = new ArrayList<User>();

	    // ��������
	    public RestUserController() {
	        User user1 = new User(1, "User1");
	        User user2 = new User(2, "User2");
	        User user3 = new User(3, "User3");
	        userList.add(user1);
	        userList.add(user2);
	        userList.add(user3);
	    }

	    // ��ѯ����
	    @GetMapping("/users")
	    public Object getAll() {
	        System.out.println("GET ��ѯ����");
	        return userList;
	    }

	    // ��ѯ����
	    @GetMapping("/users/{id}")
	    public Object getOne(@PathVariable("id") Integer id) {
	        System.out.println("GET ��ѯ����");
	        User user = null;
	        for (User u : userList) {
	            if (u.getUserId() == id) {
	                user = u;
	                break;
	            }
	        }
	        return user;
	    }

	    // ���
	    @PostMapping("/users")
	    public Object add(@RequestBody User user) {
	        System.out.println("POST���");
	        userList.add(user);
	        return user;
	    }

	    // �޸�
	    @PutMapping("/users/{id}")
	    public Object modify(@PathVariable("id") Integer id, @RequestBody User user) {
	        System.out.println("PUT�޸�");
	        for (User u : userList) {
	            if (u.getUserId() == id) {
	                u.setUserName(user.getUserName());
	            }
	        }
	        return user;
	    }

	    // ɾ������
	    @DeleteMapping("/users/{id}")
	    public Object delete(@PathVariable("id") Integer id) {
	        for (User u : userList) {
	            if (u.getUserId() == id) {
	                userList.remove(u);
	            }
	        }
	        return userList;
	    }
}
