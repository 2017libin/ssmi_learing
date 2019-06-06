/**
 * @Title: JavaHttpRequestTests.java
 * @Package cn.osxm.ssmi.chp09
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��6��7�� ����5:39:31
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
	        URL realUrl = new URL(urlPath); //����URL
	        URLConnection connection = realUrl.openConnection();//��������
	        connection.setRequestProperty("accept","*/*"); //��������
	        connection.connect(); //��������
	        Map<String,List<String>> map = connection.getHeaderFields();//��ȡ��Ӧͷ
	        BufferedReader in = new BufferedReader(new InputStreamReader(
	                connection.getInputStream())); //��ȡ��Ӧ��
	        String line="";
	        while ((line = in.readLine())!= null) {
	           System.out.println(line);
	        }
	    }
}
