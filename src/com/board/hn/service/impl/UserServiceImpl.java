package com.board.hn.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.board.hn.dao.UserDAO;
import com.board.hn.dao.impl.UserDAOImpl;
import com.board.hn.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDAO udao = new UserDAOImpl();
	
	public Map<String,String> doLogin(String id,String pwd) {
		Map<String,String> user = new HashMap<>();
		user.put("uiId",uiId);
		user.put("uiPwd",uiPwd);
		return udao.selectUser(user);//userdao로 넘어감 
	}
}
