/**
 * @Title: AdviceInvokeSequence.java
 * @Package cn.osxm.ssmi.chp17
 * @Description: TODO
 * @author oscarchen
 * @date 2019年8月6日
 * @version V1.0
 */
package cn.osxm.ssmi.chp17;

/**
  * @ClassName: AdviceInvokeSequence
  * @Description: TODO
  * @author oscarchen
  */
public class AdviceInvokeSequence {
    public static void main(String[] args) {
      /*  try {
            // 正常执行
            AdviceInvokeSequence(false);
            System.out.println("=====分割线=====");
            // 异常执行
            AdviceInvokeSequence(true);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
    }

    /**
     * 切面执行过程
     * 
     * @param isException
     * @throws Exception
     */
   /* public static void AdviceInvokeSequence(boolean isException) throws Exception {
        try {
            aroundAdvice(isException);
            afterReturningAdvice();
            return;
        } catch (Exception e) {
            afterThrowingAdvice(e);
            return;
        } finally {
            afterAdvice();
        }
    }*/

    /**
     * 环绕增强
     * 
     * @param isException
     * @throws Exception
     */
    @SuppressWarnings("unused")
	private static void aroundAdvice(boolean isException) throws Exception {
        System.out.println("around before advice");
        try {
            JoinPoint_Proceed(isException);
        } finally {
            System.out.println("around after advice");
        }
    }

    /**
     * 编织后的接入点执行过程
     * 
     * @param isException
     */
    public static void JoinPoint_Proceed(boolean isException) {
        beforeAdvice();
        targetMethod(isException);
    }

    /**
     * 前置增强
     */
    private static void beforeAdvice() {
        System.out.println("before advice");
    }

    /**
     * 目标方法
     * 
     * @param isException
     */
    private static void targetMethod(boolean isException) {
        System.out.println("target method 执行");
        if (isException)
            throw new RuntimeException("异常发生");
    }

    /**
     * 后置增强
     */
    @SuppressWarnings("unused")
	private static void afterAdvice() {
        System.out.println("after advice");
    }

    /**
     * 正常返回增强
     */
    @SuppressWarnings("unused")
	private static void afterReturningAdvice() {
        System.out.println("afterReturning");
    }

    /**
     * 异常返回增强
     * 
     * @param e
     * @throws Exception
     */
    @SuppressWarnings("unused")
	private static void afterThrowingAdvice(Exception e) throws Exception {
        System.out.println("afterThrowing:" + e.getMessage());
        throw e;
    }
}