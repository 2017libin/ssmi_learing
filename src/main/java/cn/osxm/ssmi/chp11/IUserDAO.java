/**
 * @Title: IUserDAO.java
 * @Package cn.osxm.ssmi.chp11
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��6��19�� ����11:16:58
 * @version V1.0
 */

package cn.osxm.ssmi.chp11;
/**
  * @ClassName: IUserDAO
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public interface IUserDAO {
    public User get(int id) ;
    public void add(User user);
}
