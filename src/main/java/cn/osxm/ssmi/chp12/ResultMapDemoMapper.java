/**
 * @Title: ResultMapDemoMapper.java
 * @Package cn.osxm.ssmi.chp12
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年3月1日 下午9:43:27
 * @version V1.0
 */

package cn.osxm.ssmi.chp12;
import cn.osxm.ssmi.chp12.entity.Dept;
import cn.osxm.ssmi.chp12.entity.GenUser;
/**
  * @ClassName: ResultMapDemoMapper
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public interface ResultMapDemoMapper {
	public GenUser selectUserDiscriminator(int id);

    public Dept selectDeptAssociationSelect(String id);

    public Dept selectDeptAssociationResult(String id);

    public Dept selectDeptCollectionSelect(String id);
    
    public Dept  selectDeptCollectionResult(String id);
}
