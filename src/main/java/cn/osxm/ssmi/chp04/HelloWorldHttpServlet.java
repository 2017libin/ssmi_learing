/**
 * @Title: HelloWorldHttpServlet.java
 * @Package cn.osxm.ssmi.chp4
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018��12��18�� ����5:58:46
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
        System.out.println("����Get����");
        //��Ӧ��ǰ�˵����
        resp.getWriter().println("Hello World, HttpServlet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("����Post����");
        
    }
}
