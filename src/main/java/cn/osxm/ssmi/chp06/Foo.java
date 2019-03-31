/**
 * @Title: Foo.java
 * @Package cn.osxm.ssmi.chp06
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年3月30日 上午8:23:06
 * @version V1.0
 */

package cn.osxm.ssmi.chp06;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;

/**
  * @ClassName: Foo
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class Foo {
    @Autowired
    private String name;

    @PostConstruct
    private void onInit(){
        System.out.println("onInit... " + name);
    }

    @PreDestroy
    private void onDestroy(){
        System.out.println("onDestroy... " + name);
    }
}
