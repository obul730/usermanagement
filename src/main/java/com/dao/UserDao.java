package com.dao;

import java.sql.ResultSet;
import java.sql.Statement;

import com.util.JDBCUtil;

public class UserDao {
	
	public ResultSet getAllusersResultSet() {
		System.out.println("User Dao called");
		ResultSet rs=null;
		try {
			Statement st = JDBCUtil.getConnection().createStatement();
			rs = st.executeQuery("SELECT * FROM usermanagement.users");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return rs;
	}

}
