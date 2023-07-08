package com.tenseconds.controller;

import java.io.IOException;   
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.tenseconds.repository.DbConnection;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FullNameCalculatorServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("doget has recived a pay-load");
		
		Connection connection =  DbConnection.getDbConnection();
		
		try {
			Statement statement=connection.createStatement();
			statement.execute("insert into Employee values (101,'manoj',1000);");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("dopost is called to pay-load");
		
	}

}

//String fname=(String) req.getParameter("firstname");
//String lname=(String) req.getParameter("lastname");
//String fullname=fname+" "+lname;
//
//System.out.println("fullname is"+fullname);
//
//
//
//req.setAttribute("fullname", fullname);
//
//RequestDispatcher dispatcher = req.getRequestDispatcher("views/output.jsp");
//dispatcher.forward(req, resp); 
//
//
////PrintWriter writer = resp.getWriter();
////writer.print("<html><body><p>Fullname is "+fullname+"<br>you are an good boy</p></body></html>");
//
////redirecting a html page to another html page
////resp.sendRedirect("https://github.com/");
//resp.sendRedirect("views/OutPut.html");
