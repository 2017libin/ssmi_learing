/**
 * @Title: FileUploadController.java
 * @Package cn.osxm.ssmi.chp09
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��6��7�� ����10:31:10
 * @version V1.0
 */

package cn.osxm.ssmi.chp09;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
/**
  * @ClassName: FileUploadController
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class FileUploadController {
    /*
     * ͨ�����ķ�ʽ�ϴ��ļ�
     * 
     * @RequestParam("file") ��name=file�ؼ��õ����ļ���װ��CommonsMultipartFile ����
     */
    @RequestMapping("fileUpload")
    public String fileUpload(@RequestParam("file") CommonsMultipartFile file) throws IOException {

        // ��������������ʱ��
        long startTime = System.currentTimeMillis();
        System.out.println("fileName��" + file.getOriginalFilename());

        try {
            // ��ȡ�����
            OutputStream os = new FileOutputStream("E:/" + new Date().getTime() + file.getOriginalFilename());
            // ��ȡ������ CommonsMultipartFile �п���ֱ�ӵõ��ļ�����
            InputStream is = file.getInputStream();
            int temp;
            // һ��һ���ֽڵĶ�ȡ��д��
            while ((temp = is.read()) != (-1)) {
                os.write(temp);
            }
            os.flush();
            os.close();
            is.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("����һ������ʱ�䣺" + String.valueOf(endTime - startTime) + "ms");
        return "/success";
    }

    /*
     * ����file.Transto �������ϴ����ļ�
     */
    @RequestMapping("fileUpload2")
    public String fileUpload2(@RequestParam("file") CommonsMultipartFile file) throws IOException {
        long startTime = System.currentTimeMillis();
        System.out.println("fileName��" + file.getOriginalFilename());
        String path = "E:/" + new Date().getTime() + file.getOriginalFilename();

        File newFile = new File(path);
        // ͨ��CommonsMultipartFile�ķ���ֱ��д�ļ���ע�����ʱ��
        file.transferTo(newFile);
        long endTime = System.currentTimeMillis();
        System.out.println("������������ʱ�䣺" + String.valueOf(endTime - startTime) + "ms");
        return "/success";
    }

    /*
     * ����spring�ṩ���ϴ��ļ��ķ���
     */
    @RequestMapping("springUpload")
    public String springUpload(HttpServletRequest request) throws IllegalStateException, IOException {
        long startTime = System.currentTimeMillis();
        // ����ǰ�����ĳ�ʼ���� CommonsMutipartResolver ���ಿ�ֽ�������
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());
        // ���form���Ƿ���enctype="multipart/form-data"
        if (multipartResolver.isMultipart(request)) {
            // ��request��ɶಿ��request
            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
            // ��ȡmultiRequest �����е��ļ���
            Iterator iter = multiRequest.getFileNames();

            while (iter.hasNext()) {
                // һ�α��������ļ�
                MultipartFile file = multiRequest.getFile(iter.next().toString());
                if (file != null) {
                    String path = "E:/springUpload" + file.getOriginalFilename();
                    // �ϴ�
                    file.transferTo(new File(path));
                }

            }

        }
        long endTime = System.currentTimeMillis();
        System.out.println("������������ʱ�䣺" + String.valueOf(endTime - startTime) + "ms");
        return "/success";
    }
}