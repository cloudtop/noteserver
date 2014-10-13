//package org.tarena.note.util;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.ModelAndView;
//
//public class SomeInterceptor implements HandlerInterceptor {
////
////	public void afterCompletion(HttpServletRequest arg0,
////			HttpServletResponse arg1, Object arg2, Exception arg3)
////			throws Exception {
////		// TODO Auto-generated method stub
////
////	}
////
////	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
////			Object arg2, ModelAndView arg3) throws Exception {
////		// TODO Auto-generated method stub
////
////	}
////
////	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
////			Object obj) throws Exception {
//////		Object token = request.getSession().getAttribute("token");
//////		if(token!=null){
//////			return true;
//////		}
//////		response.sendRedirect("http://localhost:8080/testNoteServer/log_in.html");
////		return false;
////	}
//
//}
