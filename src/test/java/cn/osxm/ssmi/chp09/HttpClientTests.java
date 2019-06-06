/**
 * @Title: HttpClientTests.java
 * @Package cn.osxm.ssmi.chp09
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年6月7日 上午5:38:41
 * @version V1.0
 */

package cn.osxm.ssmi.chp09;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

/**
  * @ClassName: HttpClientTests
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class HttpClientTests {
	@Test
    public void get() throws ClientProtocolException, IOException {
        String url = "http:///nplm/sessionInfo";
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(url);
        CloseableHttpResponse response = httpclient.execute(httpGet);
        HttpEntity entity = response.getEntity();
        BufferedReader br = new BufferedReader(new InputStreamReader(
                entity.getContent()));
        String line="";
        while ((line = br.readLine())!= null) {
           System.out.println(line);
        }
        EntityUtils.consume(entity);
    }
    
    @Test
    public void post() throws ClientProtocolException, IOException {
        String url = "http:///nplm/sessionInfo";
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(url);
        CloseableHttpResponse response = httpclient.execute(httpPost);
        HttpEntity entity = response.getEntity();
        BufferedReader br = new BufferedReader(new InputStreamReader(
                entity.getContent()));
        String line="";
        while ((line = br.readLine())!= null) {
           System.out.println(line);
        }
        EntityUtils.consume(entity);
    }
}
