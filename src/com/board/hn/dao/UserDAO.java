package com.board.hn.dao;

import java.util.Map;

public interface UserDAO {
	public Map<String,String> selectUser(Map<String,String> user);
}
