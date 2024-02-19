package com.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.models.Users;
import com.service.UserService;

public class GetAllUsersServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//		ArrayList<Users> userList = new ArrayList<>();
//		userList.add(new Users(5,"swamy","swamy@123",15500));
//		userList.add(new Users(6,"dilip","dilip@456",14400));
//		userList.add(new Users(7,"praveen","praveen@789",39500));

		/*
		 * UserService userService = new UserService(); List<Users> allusers =
		 * userService.getAllusers();
		 */

		List<Users> allusers2 = new UserService().getAllusers();
		System.out.println("Servlet called");
		if (allusers2 != null) {
			if (allusers2.isEmpty()) {
				System.out.println("No Data available");
				req.setAttribute("msg", "No Data available");
				req.getRequestDispatcher("/WEB-INF/views/AllUsers.jsp").forward(req, resp);

			} else {
				req.setAttribute("users", allusers2);
				req.setAttribute("msg", "Data is available");
				req.getRequestDispatcher("/WEB-INF/views/AllUsers.jsp").forward(req, resp);
			}
		}
		else {
			req.setAttribute("users", allusers2);
			req.setAttribute("msg", "List not available");
			req.getRequestDispatcher("/WEB-INF/views/AllUsers.jsp").forward(req, resp);
			
		}

	}
}
