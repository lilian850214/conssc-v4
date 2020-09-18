package com.conssc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.conssc.entity.UserInfo;
import com.conssc.service.UserLoginService;


@WebServlet(value =  "/userlogin",loadOnStartup = 1)
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
//【A】创建业务对象
	UserLoginService uLoginService;
	
//【B】在初始化方法中完成spring容器资源的加载
	@Override
	public void init() throws ServletException {
		/*************spring方式****************/
		//获取spring容器,获取service层对象		
		ApplicationContext  ac=WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
		uLoginService=(UserLoginService)ac.getBean("userLoginServiceImpl");
	}
	
//【C】声明service方法，完成请求处理
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	//设置请求编码格式
		req.setCharacterEncoding("UTF-8");
	//设置响应编码格式
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=utf-8");
	//获取请求信息
		String username=req.getParameter("username");
		String pwd=req.getParameter("pwd");
	//	处理请求，调用业务层方法，根据用户名密码
		UserInfo userInfo = uLoginService.userLoginService(username, pwd);
		//响应结果
				//获取session对象
		HttpSession session=req.getSession();
		if (userInfo!=null) {
			session.setAttribute("user", userInfo);
			
			resp.sendRedirect(req.getContextPath()+"/workleave.jsp");
		}else {
			session.setAttribute("flag","failed");
			resp.sendRedirect(req.getContextPath()+"/index.jsp");
		}
		
	}	
	}
	


