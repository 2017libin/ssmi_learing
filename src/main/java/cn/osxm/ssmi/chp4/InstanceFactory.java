/**
 * @Title: InstanceFactory.java
 * @Package cn.osxm.ssmi.chp4
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月5日 上午7:07:21
 * @version V1.0
 */

package cn.osxm.ssmi.chp4;
/**
  * @ClassName: InstanceFactory
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class InstanceFactory {
    public static Foo foo = new Foo();

    public Foo getFooInstance() {
        return foo;
    }
}
