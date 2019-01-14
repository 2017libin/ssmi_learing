/**
 * @Title: MyTestRunner.java
 * @Package cn.osxm.ssmi.chp6.junit
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月7日 下午10:42:12
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
        
        System.out.println("自行定义的测试运行器 : " + method.toString());
        super.runChild(method, notifier);
    }
}
