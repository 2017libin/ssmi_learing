/**
 * @Title: CustomExceptionHandler.java
 * @Package cn.osxm.ssmi.chp15.exception
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年7月11日 下午6:14:23
 * @version V1.0
 */

package cn.osxm.ssmi.chp15.exception;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName: CustomExceptionHandler
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class CustomExceptionHandler implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object object,
			Exception exception) {
		if (exception instanceof IOException) {
			return new ModelAndView("ioexp");
		} else if (exception instanceof SQLException) {
			return new ModelAndView("sqlexp");
		}
		return null;
	}
}
