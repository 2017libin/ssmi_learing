/**
 * @Title: DeptMapper.java
 * @Package cn.osxm.ssmi.chp12
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��3��1�� ����9:42:15
 * @version V1.0
 */

package cn.osxm.ssmi.chp12;
import cn.osxm.ssmi.com.Dept;
/**
  * @ClassName: DeptMapper
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public interface DeptMapper {
	public Dept selectDeptCollection(int id);
}
