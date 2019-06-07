/**
 * @Title: HttpClientRest.java
 * @Package cn.osxm.ssmi.chp09.rest
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��6��7�� ����10:29:59
 * @version V1.0
 */

package cn.osxm.ssmi.chp09.rest;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;

import org.apache.http.Header;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.DefaultConnectionKeepAliveStrategy;
import org.apache.http.impl.client.DefaultHttpRequestRetryHandler;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicHeader;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.client.DefaultResponseErrorHandler;
import org.springframework.web.client.RestTemplate;
/**
  * @ClassName: HttpClientRest
  * @Description: TODO
  * @author osxm:oscarxueming
  */

@Component
@Lazy(false)
public class HttpClientRest {
    private static RestTemplate restTemplate;

    static {
        // �����ӱ���30��
        PoolingHttpClientConnectionManager pollingConnectionManager = new PoolingHttpClientConnectionManager(30, TimeUnit.SECONDS);
        // ��������
        pollingConnectionManager.setMaxTotal(1000);
        // ͬ·�ɵĲ�����
        pollingConnectionManager.setDefaultMaxPerRoute(1000);

        HttpClientBuilder httpClientBuilder = HttpClients.custom();
        httpClientBuilder.setConnectionManager(pollingConnectionManager);
        // ���Դ�����Ĭ����3�Σ�û�п���
        httpClientBuilder.setRetryHandler(new DefaultHttpRequestRetryHandler(2, true));
        // ���ֳ��������ã���Ҫ��ͷ���Keep-Alive
        httpClientBuilder.setKeepAliveStrategy(new DefaultConnectionKeepAliveStrategy());

        // RequestConfig.Builder builder = RequestConfig.custom();
        // builder.setConnectionRequestTimeout(200);
        // builder.setConnectTimeout(5000);
        // builder.setSocketTimeout(5000);
        //
        // RequestConfig requestConfig = builder.build();
        // httpClientBuilder.setDefaultRequestConfig(requestConfig);

        List<Header> headers = new ArrayList<>();
        headers.add(new BasicHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/31.0.1650.16 Safari/537.36"));
        headers.add(new BasicHeader("Accept-Encoding", "gzip,deflate"));
        headers.add(new BasicHeader("Accept-Language", "zh-CN"));
        headers.add(new BasicHeader("Connection", "Keep-Alive"));

        httpClientBuilder.setDefaultHeaders(headers);

        HttpClient httpClient = httpClientBuilder.build();

        // httpClient�������ã��ײ�������RequestConfig
        HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory(httpClient);
        // ���ӳ�ʱ
        clientHttpRequestFactory.setConnectTimeout(5000);
        // ���ݶ�ȡ��ʱʱ�䣬��SocketTimeout
        clientHttpRequestFactory.setReadTimeout(5000);
        // ���Ӳ����õĵȴ�ʱ�䣬���˹������������ã��������Ӳ�����ʱ��ʱ��������������Ե�
        clientHttpRequestFactory.setConnectionRequestTimeout(200);
        // �����������ݣ�Ĭ��ֵ��true��ͨ��POST����PUT������������ʱ�����齫�����Ը���Ϊfalse������ľ��ڴ档
        // clientHttpRequestFactory.setBufferRequestBody(false);

        // �������ת����
        List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
        messageConverters.add(new StringHttpMessageConverter(Charset.forName("UTF-8")));
        messageConverters.add(new FormHttpMessageConverter());
        messageConverters.add(new MappingJackson2XmlHttpMessageConverter());
        messageConverters.add(new MappingJackson2HttpMessageConverter());

        restTemplate = new RestTemplate(messageConverters);
        restTemplate.setRequestFactory(clientHttpRequestFactory);
        restTemplate.setErrorHandler(new DefaultResponseErrorHandler());

    }

    private HttpClientRest() {

    }

    @PostConstruct
    public static RestTemplate getClient() {
        return restTemplate;
    }
}

