/**
 * @Title: SpringAddMethodInterceptor.java
 * @Package cn.osxm.ssmi.chp08.aop.cglib
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��5��19�� ����1:44:39
 * @version V1.0
 */

package cn.osxm.ssmi.chp17.cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;


/**
  * @ClassName: SpringAddMethodInterceptor
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class SpringAddMethodInterceptor implements MethodInterceptor{
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("ǰ�ô���:" + method);  
        Object object = proxy.invokeSuper(obj, args);
        System.out.println("���ô���:" + method); 
        return object;
    }
}
