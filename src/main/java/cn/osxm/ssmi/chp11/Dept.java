/**
 * @Title: Dept.java
 * @Package cn.osxm.ssmi.chp11
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年6月19日 下午11:16:21
 * @version V1.0
 */

package cn.osxm.ssmi.chp11;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
  * @ClassName: Dept
  * @Description: TODO
  * @author osxm:oscarxueming
  */

@Entity
@Table(name = "DEPT")
public class Dept  implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID")
    private int id;
    
    @Column(name = "NAME")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

