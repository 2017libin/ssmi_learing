/**
 * @Title: JavaHttpRequestTests.java
 * @Package cn.osxm.ssmi.chp09
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年6月7日 上午5:39:31
 * @version V1.0
 */

package cn.osxm.ssmi.chp09;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

import org.junit.Test;
/**
  * @ClassName: JavaHttpRequestTests
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class JavaHttpRequestTests {
	  @Test
	    public void javaNetHttpRequest() throws Exception {
	        String urlPath = "https://www.baidu.com/";
	        URL realUrl = new URL(urlPath); //创建URL
	        URLConnection connection = realUrl.openConnection();//创建连接
	        connection.setRequestProperty("accept","*/*"); //设置属性
	        connection.connect(); //建立连接
	        Map<String,List<String>> map = connection.getHeaderFields();//获取响应头
	        BufferedReader in = new BufferedReader(new InputStreamReader(
	                connection.getInputStream())); //获取响应流
	        String line="";
	        while ((line = in.readLine())!= null) {
	           System.out.println(line);
	        }
	    }
}
