/**
 * @Title: MyLogTestExecutionListener.java
 * @Package cn.osxm.ssmi.chp6.testlistener
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月30日 上午5:02:12
 * @version V1.0
 */

package cn.osxm.ssmi.chp06.testlistener;

import org.springframework.test.context.TestContext;
import org.springframework.test.context.TestExecutionListener;
/**
  * @ClassName: MyLogTestExecutionListener
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class MyLogTestExecutionListener implements TestExecutionListener {
	

    public void prepareTestInstance(TestContext testContext) throws Exception {
    }

    public void beforeTestClass(TestContext testContext) throws Exception {
        System.out.println("测试类之前执行");
    }

    public void afterTestClass(TestContext testContext) throws Exception {
        System.out.println("测试类之后执行");
    }

    public void beforeTestMethod(TestContext testContext) throws Exception {
        System.out.println("测试方法之前执行");
        MyLogTestAnno myLogTest = testContext.getTestMethod().getAnnotation(MyLogTestAnno.class);
        if (myLogTest == null) {
            return;
        }
        String logfile = myLogTest.logFileName();
        System.out.println("注解参入的参数"+logfile);
    }

    public void afterTestMethod(TestContext testContext) throws Exception {
        System.out.println("测试方法之后执行");
    }

   
}