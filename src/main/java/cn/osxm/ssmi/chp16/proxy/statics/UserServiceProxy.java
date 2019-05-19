/**
 * @Title: UserServiceProxy.java
 * @Package cn.osxm.ssmi.chp08.aop.proxy.statics
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月19日 上午10:23:38
 * @version V1.0
 */

package cn.osxm.ssmi.chp16.proxy.statics;
import cn.osxm.ssmi.chp16.IUserService;
/**
  * @ClassName: UserServiceProxy
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class UserServiceProxy implements IUserService{

    IUserService userService;
       
    public UserServiceProxy(IUserService userService) {
        this.userService = userService;
    }
  
    @Override
    public void add() {
        System.out.println("代理前");
        userService.add();      
        System.out.println("代理后");
    }

	@Override
	public void except() {
		
		// TODO Auto-generated method stub
		
	}

}
