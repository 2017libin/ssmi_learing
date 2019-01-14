/**
 * @Title: MyTestRunner.java
 * @Package cn.osxm.ssmi.chp6.junit
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��1��7�� ����10:42:12
 * @version V1.0
 */

package cn.osxm.ssmi.chp6.junit;

import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;

/**
  * @ClassName: MyTestRunner
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class MyTestRunner extends BlockJUnit4ClassRunner {
    public MyTestRunner(Class<?> klass) throws InitializationError {
        super(klass);
    }
    protected void runChild(final FrameworkMethod method, RunNotifier notifier) {
        
        System.out.println("���ж���Ĳ��������� : " + method.toString());
        super.runChild(method, notifier);
    }
}
