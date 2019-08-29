/**
 * @Title: WebExceptionHandler.java
 * @Package cn.osxm.ssmi.chp15
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年7月10日 下午11:00:31
 * @version V1.0
 */

package cn.osxm.ssmi.chp15;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
  * @ClassName: WebExceptionHandler
  * @Description: TODO
  * @author osxm:oscarxueming
  */

//@ControllerAdvice
//@ResponseBody
public class WebExceptionHandler {//GlobalExceptionHandler
  @SuppressWarnings("unused")
private static Logger logger = LoggerFactory.getLogger(WebExceptionHandler.class);

  /**
   * 400 - Bad Request
   */
  //@ResponseStatus(HttpStatus.BAD_REQUEST)
  //@ExceptionHandler(HttpMessageNotReadableException.class)
  //public Map<String,String> handleHttpMessageNotReadableException(HttpMessageNotReadableException e) {
      //logger.error("参数解析失败", e);
      //return ("could_not_read_json");
  //}

  /**
   * 405 - Method Not Allowed
   */
 /* @ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
  @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
  public ServiceResponse handleHttpRequestMethodNotSupportedException(HttpRequestMethodNotSupportedException e) {
      logger.error("不支持当前请求方法", e);
      return ServiceResponseHandle.failed("request_method_not_supported");
  }*/

  /**
   * 415 - Unsupported Media Type
   */
  /*@ResponseStatus(HttpStatus.UNSUPPORTED_MEDIA_TYPE)
  @ExceptionHandler(HttpMediaTypeNotSupportedException.class)
  public ServiceResponse handleHttpMediaTypeNotSupportedException(Exception e) {
      logger.error("不支持当前媒体类型", e);
      return ServiceResponseHandle.failed("content_type_not_supported");
  }*/

  /**
   * 500 - Internal Server Error
   */
  //@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
 // @ExceptionHandler(Exception.class)
  /*public ServiceResponse handleException(Exception e) {
      if (e instanceof BusinessException) {
          return ServiceResponseHandle.failed("BUSINESS_ERROR", e.getMessage());
      }

      logger.error("服务运行异常", e);
      e.printStackTrace();
      return ServiceResponseHandle.failed("server_error");
  }*/

}
