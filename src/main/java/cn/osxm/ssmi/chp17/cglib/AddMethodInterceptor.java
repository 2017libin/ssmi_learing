/**
 * @Title: AddMethodInterceptor.java
 * @Package cn.osxm.ssmi.chp08.aop.cglib
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月19日 上午10:21:24
 * @version V1.0
 */

package cn.osxm.ssmi.chp17.cglib;
import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
/**
  * @ClassName: AddMethodInterceptor
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class AddMethodInterceptor implements MethodInterceptor{
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("前置处理:" + method);  
        Object object = proxy.invokeSuper(obj, args);
        System.out.println("后置处理:" + method); 
        return object;
    }
}