/**
 * @Title: ClassA.java
 * @Package cn.osxm.ssmi.chp6.relfutil
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月7日 下午10:52:42
 * @version V1.0
 */

package cn.osxm.ssmi.chp6.relfutil;
/**
  * @ClassName: ClassA
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class ClassA {
    
    @Autowired
    private ClassB beanB;

    public ClassB getBeanB() {
        return beanB;
    }

}
