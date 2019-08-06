/**
 * @Title: MyMethodInterceptor.java
 * @Package cn.osxm.ssmi.chp17.interceptor
 * @Description: TODO
 * @author oscarchen
 * @date 2019��8��6��
 * @version V1.0
 */
package cn.osxm.ssmi.chp17.interceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
  * @ClassName: MyMethodInterceptor
  * @Description: TODO
  * @author oscarchen
  */
public class MyMethodInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("����ִ��ǰ");
        Object object = invocation.proceed();
        System.out.println("����ִ�к�");
        return object;
    }
}