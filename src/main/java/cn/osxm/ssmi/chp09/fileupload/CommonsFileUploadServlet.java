/**
 * @Title: CommonsFileUploadServlet.java
 * @Package cn.osxm.ssmi.chp09.file
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��6��13�� ����8:43:51
 * @version V1.0
 */

package cn.osxm.ssmi.chp09.fileupload;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
/**
  * @ClassName: CommonsFileUploadServlet
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class CommonsFileUploadServlet extends HttpServlet {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        DiskFileItemFactory factory = new DiskFileItemFactory(); // �����ļ�����
        ServletFileUpload upload = new ServletFileUpload(factory); // �ļ��ϴ�����
        List<FileItem> items = null;
        try {
            items = upload.parseRequest(request);
            // ���� list���������� ÿ�������� �е���Ϣ
            for (FileItem item : items) {
                String fileName = item.getName(); 
                item.write(new File("D:\\uploads", fileName));
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}

