package com.base.interceptor;

import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  

  

import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;  
import org.springframework.web.servlet.ModelAndView;  

public class LoginInterceptor implements HandlerInterceptor{
	
    //Handler执行之前调用这个方法 
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		String url = request.getRequestURI();  
		
//        if(url.indexOf("first.action")>=0){  
//            return true;  
//        }else{
//            //不符合条件的，跳转到登录界面  
//           // request.getRequestDispatcher("WEB-INF/jsp/login.jsp").forward(request, response);  
//            return false;  
//        }
//		
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
