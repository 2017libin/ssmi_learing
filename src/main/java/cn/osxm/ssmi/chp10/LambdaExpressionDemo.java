/**
 * @Title: LambdaExpressionDemo.java
 * @Package cn.osxm.ssmi.chp10
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年6月23日 下午1:43:04
 * @version V1.0
 */

package cn.osxm.ssmi.chp10;
/**
  * @ClassName: LambdaExpressionDemo
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class LambdaExpressionDemo {

    interface HelloServiceI {
        void sayHello(String message);
     }
    public static void main(String args[]){
        HelloServiceI helloService = message -> System.out.println("Hello " + message);
        helloService.sayHello("Zhang San");
    }
}
