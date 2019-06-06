/**
 * @Title: RestTemplateTests.java
 * @Package cn.osxm.ssmi.chp09
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年6月7日 上午5:40:06
 * @version V1.0
 */

package cn.osxm.ssmi.chp09;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;
/**
  * @ClassName: RestTemplateTests
  * @Description: TODO
  * @author osxm:oscarxueming
  */

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:cn/osxm/ssmi/chp09/rest-template.xml")
public class RestTemplateTests {

    @Autowired
    private RestTemplate simpleRestTemplate;

    //@Test
    public void simpleRestTemplateStr() {
        String url = "https://www.baidu.com/";
        String string = simpleRestTemplate.getForObject(url,String.class);
        System.out.println(string);
    }
    
    @Test
    public void simpleRestTemplate() {
        String url = "http://p1:7001/nplm/sessionInfo";
        String string = simpleRestTemplate.getForObject(url,String.class);
        System.out.println(string);
//        User user = simpleRestTemplate.getForObject(url,User.class);
//        System.out.println(user);
    }
}

