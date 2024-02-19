package com.servlets;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.err.println("User Registeration servlet");
		String pathInfo=req.getPathInfo();
		if (pathInfo!=null) {
			String[] split=pathInfo.split("/");
//			System.out.println(split[0]);
			System.out.println(split[1]);
			System.out.println(split[2]);
		}
		
		String usertype = req.getParameter("userType");
		System.out.println(usertype);
		req.getRequestDispatcher("/WEB-INF/views/UserRegistration.html").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String firstName = req.getParameter("first");
		String lastName = req.getParameter("last");
		String email = req.getParameter("email");
		String dob = req.getParameter("dob");
		String passwo = req.getParameter("password");
		String phone = req.getParameter("mobile");
		String gendertype = req.getParameter("gender");
		
		System.out.println("Registration doPost method"+" "+firstName+" "+lastName+" "+email+" "+dob+" "+passwo+" "+phone+" "+gendertype);
		
		req.getRequestDispatcher("/WEB-INF/views/Registration.html").forward(req, resp);
	}

}
