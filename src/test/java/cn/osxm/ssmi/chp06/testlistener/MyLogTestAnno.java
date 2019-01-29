/**
 * @Title: MyLogTestAnno.java
 * @Package cn.osxm.ssmi.chp6.testlistener
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月30日 上午5:01:28
 * @version V1.0
 */

package cn.osxm.ssmi.chp06.testlistener;
import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
/**
  * @ClassName: MyLogTestAnno
  * @Description: TODO
  * @author osxm:oscarxueming
  */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Inherited
@Documented
public @interface MyLogTestAnno {
    public String logFileName();  
}
