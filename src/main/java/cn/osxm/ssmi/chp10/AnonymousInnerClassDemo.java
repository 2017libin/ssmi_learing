/**
 * @Title: AnonymousInnerClassDemo.java
 * @Package cn.osxm.ssmi.chp10
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年6月23日 下午1:42:34
 * @version V1.0
 */

package cn.osxm.ssmi.chp10;

/**
  * @ClassName: AnonymousInnerClassDemo
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class AnonymousInnerClassDemo {
	   
    interface HelloServiceI {
        void sayHello(String message);
     }
    
    public HelloServiceI getHelloServiceImpl() {
        return new HelloServiceI() {
            @Override
            public void sayHello(String message) {            
                System.out.println("Hello " + message);
            }
        };
    }

    
    public static void main(String[] args) {
        /*NoImplementInterfaceDemo demo = new NoImplementInterfaceDemo();
        HelloServiceI helloServiceI= demo.getHelloServiceImpl();
        helloServiceI.sayHello("Zhang San");
        */
        
        HelloServiceI helloServiceI= new HelloServiceI() {
            @Override
            public void sayHello(String message) {            
                System.out.println("Hello " + message);
            }
        };
        helloServiceI.sayHello("Zhang San");
    }

}
