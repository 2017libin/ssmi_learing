/**
 * @Title: FooService.java
 * @Package cn.osxm.ssmi.chp10
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018��12��25�� ����6:20:21
 * @version V1.0
 */

package cn.osxm.ssmi.chp10;
/**
  * @ClassName: FooService
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public interface FooService {
    Foo getFoo(String fooName);

    void addFoo(Foo foo);
}
