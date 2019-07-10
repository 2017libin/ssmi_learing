/**
 * @Title: ExceptionHandlerBean.java
 * @Package cn.osxm.ssmi.chp15
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��7��10�� ����10:59:47
 * @version V1.0
 */

package cn.osxm.ssmi.chp15;

import java.io.IOException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
/**
  * @ClassName: ExceptionHandlerBean
  * @Description: TODO
  * @author osxm:oscarxueming
  */
//@Slf4j
@ControllerAdvice
public class ExceptionHandlerBean  extends ResponseEntityExceptionHandler {

  /**
   * �����Ҳ����쳣
   * @param ex
   * @param request
   * @return
   * @throws IOException
   */
  @ExceptionHandler({DataNotFoundException.class})
  public ResponseEntity<Object> handleDataNotFoundException(RuntimeException ex, WebRequest request) throws IOException {
      return getResponseEntity(ex,request,ReturnStatusCode.DataNotFoundException);
  }

  /**
   * ���ݸ����쳣���� ResponseEntity ʵ��. ���������ϸ����쳣
   * @param ex
   * @param request
   * @param specificException
   * @return
   */
  private ResponseEntity<Object> getResponseEntity(RuntimeException ex, WebRequest request, ReturnStatusCode specificException) {

      ReturnTemplate returnTemplate = new ReturnTemplate();
      returnTemplate.setStatusCode(specificException);
      returnTemplate.setErrorMsg(ex.getMessage());

      return handleExceptionInternal(ex, returnTemplate,
              new HttpHeaders(), HttpStatus.OK, request);
  }

}