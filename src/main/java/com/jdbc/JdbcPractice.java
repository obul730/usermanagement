
package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.models.Users;

public class JdbcPractice {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" , "root", "root");
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM usermanagement.users");
			
			ArrayList<Users> userList = new ArrayList<>();
			while(rs.next()) {
				
//				String uname = rs.getString("username");
//				int idnum = rs.getInt("user_id");
//				System.out.println(idnum + " - " + uname);
				
				userList.add(new Users(rs.getInt("user_id"), rs.getString("username"), rs.getString("password"), rs.getInt("salary")));
			}
			System.out.println(userList);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
