/**
 * @Title: AppConfig.java
 * @Package cn.osxm.ssmi.chp07.annoCfg
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年3月25日 上午6:03:01
 * @version V1.0
 */

package cn.osxm.ssmi.chp07.annoCfg;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
/**
  * @ClassName: AppConfig
  * @Description: TODO
  * @author osxm:oscarxueming
  */

@Configuration
@EnableTransactionManagement
@EnableAsync
@EnableAspectJAutoProxy
@EnableScheduling
// @Import({ RestServiceConfiguration.class, BatchConfiguration.class,
// DatabaseConfiguration.class, ScheduleConfiguration.class})
@ComponentScan({ "cn.osxm", "com.dao", "com.other" })
public class AppConfig {
    // private Logger logger = LoggerFactory.getLogger(AppConfig.class);

    /**
     * 
     */
    public AppConfig() {
        // TODO Auto-generated constructor stub
        // logger.info("[Initialize application]");
        // Locale.setDefault(Locale.US);
    }
}
