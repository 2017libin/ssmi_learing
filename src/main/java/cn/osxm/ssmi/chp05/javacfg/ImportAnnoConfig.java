/**
 * @Title: ImportAnnoConfig.java
 * @Package cn.osxm.ssmi.chp05.javacfg
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年3月19日 上午6:41:48
 * @version V1.0
 */

package cn.osxm.ssmi.chp05.javacfg;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
  * @ClassName: ImportAnnoConfig
  * @Description: TODO
  * @author osxm:oscarxueming
  */
@Configuration
@Import({AppConfig.class})
public class ImportAnnoConfig {

}
