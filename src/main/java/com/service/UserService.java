package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dao.UserDao;
import com.models.Users;

public class UserService {
	
	
	public List<Users> getAllusers() {
		System.out.println("user service called");
		ArrayList<Users> userList = new ArrayList<>();
		
		ResultSet rs = new UserDao().getAllusersResultSet();
		try {
			while(rs.next()) {
				userList.add(new Users(rs.getInt("user_id"), rs.getString("username"), rs.getString("password"), rs.getInt("salary")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userList;
	}
	
	
	

}
