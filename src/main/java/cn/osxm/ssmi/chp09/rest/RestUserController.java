/**
 * @Title: RestUserController.java
 * @Package cn.osxm.ssmi.chp09.rest
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年4月4日 下午11:00:27
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

import cn.osxm.ssmi.com.User;
import cn.osxm.ssmi.com.anno.UserServiceImpl;
/**
  * @ClassName: RestUserController
  * @Description: TODO
  * @author osxm:oscarxueming
  */

@RestController
public class RestUserController {

    public List<User> userList = new ArrayList<User>();

    // 测试数据
    public RestUserController() {
        User user1 = new User(1, "User1");
        User user2 = new User(1, "User2");
        User user3 = new User(1, "User3");
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
    }

    // 查询所有
    @GetMapping("/rest/users")
    public Object getAll() {
        System.out.println("GET 查询所有");
        return userList;
    }

    // 查询单个
    @GetMapping("/rest/users/{id}")
    public Object getOne(@PathVariable("id") Integer id) {
        System.out.println("GET 查询单个");
        User user = null;
        for (User u : userList) {
            if (u.getId() == id) {
                user = u;
                break;
            }
        }
        return user;
    }

    // 添加
    @PostMapping("/rest/users")
    public Object add(@RequestBody User user) {
        System.out.println("POST添加");
        userList.add(user);
        return userList;
    }

    // 修改
    @PutMapping("/rest/users/{id}")
    public Object modify(@PathVariable("id") Integer id, @RequestBody User user) {
        System.out.println("PUT修改");
        for (User u : userList) {
            if (u.getId() == id) {
                u.setName(user.getName());
            }
        }
        return user;
    }

    // 删除单个
    @DeleteMapping("/rest/users/{id}")
    public Object delete(@PathVariable("id") Integer id) {
        for (User u : userList) {
            if (u.getId() == id) {
                userList.remove(u);
            }
        }
        return userList;
    }

}
