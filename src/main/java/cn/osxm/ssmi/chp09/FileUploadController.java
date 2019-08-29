/**
 * @Title: FileUploadController.java
 * @Package cn.osxm.ssmi.chp09
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年6月7日 上午10:31:10
 * @version V1.0
 */

package cn.osxm.ssmi.chp09;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

/**
 * @ClassName: FileUploadController
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class FileUploadController {
	@RequestMapping("/springServletFileUpload")
	public void springServletFileUpload(HttpServletRequest request) throws IOException, ServletException {
		/*
		 * Collection<Part> parts = request.getParts();
		 * 已经转换成StandardMultipartHttpServletRequest for (Part part : parts) { //
		 * 获取请求头，请求头的格式：form-data; name="file"; filename="snmp4j--api.zip" String header
		 * = part.getHeader("content-disposition"); String[] headerArray =
		 * header.split(";"); String[] filenameArray = headerArray[2].split("="); String
		 * fileName = filenameArray[1].substring(filenameArray[1].
		 * lastIndexOf("\\") + 1).replaceAll("\"", ""); part.write("D:\\uploads" +
		 * File.separator + fileName); }
		 */

		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		MultipartFile multipartFile = multipartRequest.getFile("myfile");
		String fileName = multipartFile.getOriginalFilename();
		multipartFile.transferTo(new File("D:/uploads/" + fileName));
	}

	@RequestMapping("/springCommonFileUpload")
	public void springCommonFileUpload(HttpServletRequest request) throws IOException, ServletException {
		// request is DefaultMultipartHttpServletRequest
		// 以下是多此一举
		// MultipartResolver resolver = new
		// CommonsMultipartResolver(request.getServletContext());
		// MultipartHttpServletRequest multipartRequest =
		// resolver.resolveMultipart(request);
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		MultipartFile multipartFile = multipartRequest.getFile("myfile");
		String fileName = multipartFile.getOriginalFilename();
		multipartFile.transferTo(new File("D:/uploads/" + fileName));
		/*
		 * InputStream ins = multipartFile.getInputStream(); byte[] mfbt = new
		 * byte[(int) multipartFile.getSize()]; ins.read(mfbt); OutputStream os = new
		 * FileOutputStream("D:/uploads/" + fileName); os.flush(); os.close();
		 * ins.close();
		 */
	}

	@RequestMapping("/springAnnoFileUpload")
// public void springAnnoFileUpload(@RequestParam(name = "myfile") MultipartFile
// multipartFile) throws IOException, ServletException {
	public void springAnnoFileUpload(MultipartFile myfile) throws IOException, ServletException {
		String fileName = myfile.getOriginalFilename();
		myfile.transferTo(new File("D:/uploads/" + fileName));
	}

	@RequestMapping("/springMultiFileUpload")
//public void  springMultiFileUpload(@RequestParam(name = "myfile") MultipartFile[] myfile)  throws IOException, ServletException{
//public void  springMultiFileUpload(MultipartFile[] myfile)  throws IOException, ServletException{
	public void springMultiFileUpload(MultipartFile[] myfile) throws IOException, ServletException {
		for (int i = 0; i < myfile.length; i++) {
			String fileName = myfile[i].getOriginalFilename();
			myfile[i].transferTo(new File("D:/uploads/" + fileName));
		}
	}

	@RequestMapping("/springMultiFileUpload2")
	public void springMultiFileUpload2(MultipartFile myfile1, MultipartFile myfile2)
			throws IOException, ServletException {
		String fileName = myfile1.getOriginalFilename();
		myfile1.transferTo(new File("D:/uploads/" + fileName));
		fileName = myfile2.getOriginalFilename();
		myfile2.transferTo(new File("D:/uploads/" + fileName));
	}

// @RequestMapping("/springservletupload")
	public void springCommonFileUpload2(HttpServletRequest request) throws IOException, ServletException {
		// CommonsMultipartResolver cmr = new
		// CommonsMultipartResolver(request.getServletContext());
		MultipartHttpServletRequest mr = (MultipartHttpServletRequest) request;
		MultipartFile multipartFile = mr.getFile("myfile");
		InputStream ins = multipartFile.getInputStream();
		byte[] mfbt = new byte[(int) multipartFile.getSize()];
		ins.read(mfbt);
		String fileName = multipartFile.getOriginalFilename();
		OutputStream os = new FileOutputStream("D:\\uploads\\" + fileName);
		os.flush();
		os.close();
		ins.close();
	}

	@SuppressWarnings("rawtypes")
	@RequestMapping(value = "/springcommonupload2")
	public ResponseEntity uploadPdf(@RequestParam(name = "myfile") MultipartFile file) throws IOException {
		File convFile = new File("D:\\uploads\\" + file.getName());
		try {
			file.transferTo(convFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new ResponseEntity(HttpStatus.OK);
	}
}