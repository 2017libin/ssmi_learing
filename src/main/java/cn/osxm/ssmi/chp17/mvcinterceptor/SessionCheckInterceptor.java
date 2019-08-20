/**
 * @Title: SessionCheckInterceptor.java
 * @Package cn.osxm.ssmi.chp17.mvcinterceptor
 * @Description: TODO
 * @author oscarchen
 * @date 2019年8月20日
 * @version V1.0
 */
package cn.osxm.ssmi.chp17.mvcinterceptor;

import javax.annotation.Nullable;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName: SessionCheckInterceptor
 * @Description: TODO
 * @author oscarchen
 */
public class SessionCheckInterceptor implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// 方法处理前参数、登录、权限验证
		System.out.println("PermissionInterceptor preHandle");
		if (request.getSession().getAttribute("username") == null) {
			response.sendRedirect("/daport/login.jsp");
		}
		return true;// 方法给予执行，就是允许controller的方法进行执行
		// false 不允许，可以在这之前在reponse中编写返回的结果
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			@Nullable ModelAndView modelAndView) throws Exception {
		// 处理完成，返回结果之前，可以对request和reponse进行处理
		System.out.println("PermissionInterceptor postHandle");
	}

	/*
	 * @Override public void afterCompletion(HttpServletRequest request,
	 * HttpServletResponse response, Object handler,
	 * 
	 * @Nullable Exception ex) throws Exception { // 请求处理完毕，即将销毁的时候，执行，可以做一些资源释放等工作
	 * System.out.println("PermissionInterceptor afterCompletion"); }
	 */
}
