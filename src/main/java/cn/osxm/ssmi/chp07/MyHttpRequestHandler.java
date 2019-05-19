/**
 * @Title: MyHttpRequestHandler.java
 * @Package cn.osxm.ssmi.chp07
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月19日 上午10:20:03
 * @version V1.0
 */

package cn.osxm.ssmi.chp07;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;
/**
  * @ClassName: MyHttpRequestHandler
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class MyHttpRequestHandler implements HttpRequestHandler {

    public void handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("name", "value");
        request.getRequestDispatcher("/WEB-INF/view/hello.jsp").forward(request, response);
    }
}
