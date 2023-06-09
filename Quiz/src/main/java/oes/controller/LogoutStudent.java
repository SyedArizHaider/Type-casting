package oes.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


//printing msg method 

/**
 * implementation class LogoutStudent
 */
@WebServlet("/oes.controller.LogoutStudent")
public class LogoutStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogoutStudent() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		 session.invalidate();
		 String msg1 = "Logged out successfully";
		 response.sendRedirect("StudentLogin.jsp?msg1="+msg1);
	}



}