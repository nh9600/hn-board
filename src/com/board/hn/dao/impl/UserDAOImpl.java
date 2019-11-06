package com.board.hn.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.board.hn.common.DBCon;
import com.board.hn.common.DBExecutor;
import com.board.hn.dao.UserDAO;

public class UserDAOImpl implements UserDAO {

	public Map<String,String> selectUser(Map<String,String> board){
		Connection con = DBCon.getCon();
		DBExecutor dbe = new DBExecutor();
		String sql = "select * from user_info where ui_id=? and ui_pwd";
		try {
			PreparedStatement ps = dbe.prepared(con,sql);
			ps.setString(1,"uiId");
			ps.setString(2,"uiPwd");
			ResultSet rs = dbe.executeQuery();
			if(rs.next()) {
				Map<String,String> user = new HashMap<>();
				user.put("uiId",rs.getString("uiId"));
				user.put("uiPwd",rs.getString("uiPwd"));
				return user;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return board;
		
	}

}
