/**
 * @Title: ValidationAdvice.java
 * @Package cn.osxm.ssmi.chp08.validator
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年6月1日 上午10:27:55
 * @version V1.0
 */

package cn.osxm.ssmi.chp08.validator;
/**
  * @ClassName: ValidationAdvice
  * @Description: TODO
  * @author osxm:oscarxueming
  */

import java.util.stream.Collectors;

import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @ClassName: ValidationAdvice
 * @Description: TODO
 * @author oscarchen
 */
@ControllerAdvice
public class ValidationAdvice extends ResponseEntityExceptionHandler {
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status,
            WebRequest request) {
        String message = ex.getBindingResult().getAllErrors().stream().map(DefaultMessageSourceResolvable::getDefaultMessage).collect(Collectors.joining(","));
        return ResponseEntity.badRequest().body(message);
    }
}

