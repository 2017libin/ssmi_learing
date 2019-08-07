/**
 * @Title: MyNameMatchPointCut.java
 * @Package cn.osxm.ssmi.chp17.pointcut
 * @Description: TODO
 * @author oscarchen
 * @date 2019Äê8ÔÂ7ÈÕ
 * @version V1.0
 */
package cn.osxm.ssmi.chp17.pointcut;

import java.lang.reflect.Method;

import org.springframework.aop.support.NameMatchMethodPointcut;

/**
  * @ClassName: MyNameMatchPointCut
  * @Description: TODO
  * @author oscarchen
  */
public class MyNameMatchPointCut extends NameMatchMethodPointcut {

    public boolean matches(Method method, Class targetClass) {
        this.setMappedName("add");
        // this.setMappedName("*User");
        return super.matches(method, targetClass);
    }
}

