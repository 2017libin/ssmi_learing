/**
 * @Title: HelloWorldHttpServlet.java
 * @Package cn.osxm.ssmi.chp4
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018年12月18日 上午5:58:46
 * @version V1.0
 */

package cn.osxm.ssmi.chp04;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
  * @ClassName: HelloWorldHttpServlet
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class HelloWorldHttpServlet extends HttpServlet {
    /**
	  * @Fields serialVersionUID : TODO
	  */
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("处理Get请求");
        //响应到前端的输出
        resp.getWriter().println("Hello World, HttpServlet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("处理Post请求");
        
    }
}
