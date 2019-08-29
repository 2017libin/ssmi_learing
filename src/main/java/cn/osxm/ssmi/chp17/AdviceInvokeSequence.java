/**
 * @Title: AdviceInvokeSequence.java
 * @Package cn.osxm.ssmi.chp17
 * @Description: TODO
 * @author oscarchen
 * @date 2019��8��6��
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
            // ����ִ��
            AdviceInvokeSequence(false);
            System.out.println("=====�ָ���=====");
            // �쳣ִ��
            AdviceInvokeSequence(true);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
    }

    /**
     * ����ִ�й���
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
     * ������ǿ
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
     * ��֯��Ľ����ִ�й���
     * 
     * @param isException
     */
    public static void JoinPoint_Proceed(boolean isException) {
        beforeAdvice();
        targetMethod(isException);
    }

    /**
     * ǰ����ǿ
     */
    private static void beforeAdvice() {
        System.out.println("before advice");
    }

    /**
     * Ŀ�귽��
     * 
     * @param isException
     */
    private static void targetMethod(boolean isException) {
        System.out.println("target method ִ��");
        if (isException)
            throw new RuntimeException("�쳣����");
    }

    /**
     * ������ǿ
     */
    @SuppressWarnings("unused")
	private static void afterAdvice() {
        System.out.println("after advice");
    }

    /**
     * ����������ǿ
     */
    @SuppressWarnings("unused")
	private static void afterReturningAdvice() {
        System.out.println("afterReturning");
    }

    /**
     * �쳣������ǿ
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