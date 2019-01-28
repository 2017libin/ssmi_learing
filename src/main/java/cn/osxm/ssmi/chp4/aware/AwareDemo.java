/**
 * @Title: AwareDemo.java
 * @Package cn.osxm.ssmi.chp4.aware
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月28日 下午9:52:58
 * @version V1.0
 */

package cn.osxm.ssmi.chp4.aware;
/**
  * @ClassName: AwareDemo
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class AwareDemo {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        ApplicationContext context = new ClassPathXmlApplicationContext("cn/osxm/ssmi/chp4/awareContext.xml");
        
        UserWithBeanNameAware userWithBeanNameAware= (UserWithBeanNameAware)context.getBean("user1");
        System.out.println(userWithBeanNameAware.getBeanName());
        User user= (User)context.getBean("user2");
        System.out.println(user.getBeanName());
    }
}
