/**
 * @Title: MyFilter.java
 * @Package cn.osxm.ssmi.chp08.filterInterceptor
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月18日 下午10:17:43
 * @version V1.0
 */

package cn.osxm.ssmi.chp08.filterInterceptor;
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
/**
  * @ClassName: MyFilter
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class MyFilter implements Filter{

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        chain.doFilter(request, response);      
    }

}
