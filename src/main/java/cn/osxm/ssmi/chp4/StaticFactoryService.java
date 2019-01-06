/**
 * @Title: StaticFactoryService.java
 * @Package cn.osxm.ssmi.chp4
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月5日 上午7:08:00
 * @version V1.0
 */

package cn.osxm.ssmi.chp4;
/**
  * @ClassName: StaticFactoryService
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class StaticFactoryService {
    public static StaticFactoryService service = new StaticFactoryService();
    //静态方法，返回该类的静态实例
    public static StaticFactoryService getInstance() {
        return service;
    }
}
