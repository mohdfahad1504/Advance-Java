package com.task.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.task.conn.ConnectionPool;

@WebServlet("/register")
public class Register extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Read The Data
		String user = req.getParameter("username");
		String email = req.getParameter("email");
		String pwd = req.getParameter("password");	
		
		// Get The Connection
		Connection con = ConnectionPool.giveConnection();
		
		try {
			// Insert The Data Into DataBase
			String insert = "INSERT INTO users VALUES(?,?,?)";
			
			PreparedStatement pstm = con.prepareStatement(insert);
			pstm.setString(1, user);
			pstm.setString(2, email);
			pstm.setString(3, pwd);
			
			int result = pstm.executeUpdate();
			System.out.println("Record Inserted : "+result);
			
			ConnectionPool.submitConnectoin(con);
			
			// Return Response with Success or Error Message
			RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
			req.setAttribute("success", "Registed Successfully");
			rd.forward(req, resp);
			
		} catch (SQLException e) {
			e.printStackTrace();
			RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
			req.setAttribute("error", "Already Registered");
			rd.forward(req, resp);
		}
	}
}
