/**
 * @Title: StaticFactoryService.java
 * @Package cn.osxm.ssmi.chp4
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��1��5�� ����7:08:00
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
    //��̬���������ظ���ľ�̬ʵ��
    public static StaticFactoryService getInstance() {
        return service;
    }
}
