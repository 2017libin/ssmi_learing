package cn.osxm.ssmi.chp09.fileupload;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * @ClassName: ServletUploadServlet
 * @Description: TODO
 * @author oscarchen
 */
@MultipartConfig
public class ServletUploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Collection<Part> parts = request.getParts();
		for (Part part : parts) {
			// 获取请求头，请求头的格式：form-data; name="file"; filename="snmp4j--api.zip"
			String header = part.getHeader("content-disposition");
			String[] headerArray = header.split(";");
			String[] filenameArray = headerArray[2].split("=");
			String fileName = filenameArray[1].substring(filenameArray[1].lastIndexOf("\\") + 1).replaceAll("\"", "");
			part.write("D:\\uploads" + File.separator + fileName);
		}
	}
}
