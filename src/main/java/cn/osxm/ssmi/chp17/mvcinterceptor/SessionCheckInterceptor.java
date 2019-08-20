/**
 * @Title: SessionCheckInterceptor.java
 * @Package cn.osxm.ssmi.chp17.mvcinterceptor
 * @Description: TODO
 * @author oscarchen
 * @date 2019��8��20��
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
		// ��������ǰ��������¼��Ȩ����֤
		System.out.println("PermissionInterceptor preHandle");
		if (request.getSession().getAttribute("username") == null) {
			response.sendRedirect("/daport/login.jsp");
		}
		return true;// ��������ִ�У���������controller�ķ�������ִ��
		// false ��������������֮ǰ��reponse�б�д���صĽ��
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			@Nullable ModelAndView modelAndView) throws Exception {
		// ������ɣ����ؽ��֮ǰ�����Զ�request��reponse���д���
		System.out.println("PermissionInterceptor postHandle");
	}

	/*
	 * @Override public void afterCompletion(HttpServletRequest request,
	 * HttpServletResponse response, Object handler,
	 * 
	 * @Nullable Exception ex) throws Exception { // ��������ϣ��������ٵ�ʱ��ִ�У�������һЩ��Դ�ͷŵȹ���
	 * System.out.println("PermissionInterceptor afterCompletion"); }
	 */
}
