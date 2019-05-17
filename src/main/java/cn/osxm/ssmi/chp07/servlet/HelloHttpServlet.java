package cn.osxm.ssmi.chp07.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloHttpServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// org.apache.catalina.core.ApplicationDispatcher
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/index.jsp");
		// req.getServletContext().getRequestDispatcher("/index.jsp").forward(req,
		// resp);
		PrintWriter pw = resp.getWriter();
		String myDispatcherMethod = req.getParameter("myDispatcherMethod");
		if (myDispatcherMethod != null && myDispatcherMethod.equals("forward")) {
			pw.println("Before RequestDispatcher Forword ...");
			requestDispatcher.forward(req, resp);
			pw.println("After RequestDispatcher Forword ...");
		} else if (myDispatcherMethod != null && myDispatcherMethod.equals("include")) {
			pw.println("Before RequestDispatcher Include ...");
			requestDispatcher.include(req, resp);
			pw.println("After RequestDispatcher Include ...");
		} else if (myDispatcherMethod != null && myDispatcherMethod.equals("sendRedirect")) {
			resp.sendRedirect("index.jsp");
		}
		pw.flush();
	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

}
