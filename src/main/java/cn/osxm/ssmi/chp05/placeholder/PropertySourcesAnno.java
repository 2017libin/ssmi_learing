/**
 * @Title: PropertySourcesAnno.java
 * @Package cn.osxm.ssmi.chp05.placeholder
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月31日 上午5:46:57
 * @version V1.0
 */

package cn.osxm.ssmi.chp05.placeholder;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import cn.osxm.ssmi.com.MyDataSource;
/**
  * @ClassName: PropertySourcesAnno
  * @Description: TODO
  * @author osxm:oscarxueming
  */

@Configuration
//@PropertySources(@PropertySource(value = "classpath:cn/osxm/ssmi/chp05/placeholder.properties"))
@PropertySource(value={"classpath:cn/osxm/ssmi/chp05/placeholder.properties"})
public class PropertySourcesAnno {

  @Bean
  public MyDataSource myDataSource() {
      return new MyDataSource();
  }
}
