/**
 * @Title: UserWithBeanNameAware.java
 * @Package cn.osxm.ssmi.chp4.aware
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��1��28�� ����9:54:38
 * @version V1.0
 */

package cn.osxm.ssmi.chp04.aware;

import org.springframework.beans.factory.BeanNameAware;

/**
  * @ClassName: UserWithBeanNameAware
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class UserWithBeanNameAware  implements BeanNameAware{
	private String beanName;

    public String getBeanName() {
        return beanName;
    }

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }
}
