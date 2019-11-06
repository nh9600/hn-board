package com.board.hn.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.board.hn.service.UserService;
import com.board.hn.service.impl.UserServiceImpl;

public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService us = new UserServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uiId = request.getParameter("uiId");
		String uiPwd = request.getParameter("uiPwd");
		String uiName = request.getParameter("uiName");
		String uri = request.getRequestURI();
		String path = "/views/msg";
		String cmd = uri.substring(7);
		Map<String,String> user  = us.doLogin(uiId,uiPwd);
		if("login".equals(cmd)) {
			Map<String,String> user = 
		}
		
	}

}
