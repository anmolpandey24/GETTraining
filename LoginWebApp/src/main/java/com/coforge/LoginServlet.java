package com.coforge;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		String uname=request.getParameter("uname");
		String pwd=request.getParameter("pwd");
		RequestDispatcher rd=null;
		
		User user = null;
		
		for(User u: User.users) {
			if(u.getUsername().equals(uname)) {
				user = u;
				break;
			}
		}
		
		if(user== null) {
			out.println("User not found");
			out.close();
			return;
		}
		
		else if(uname.equals(user.getUsername())&& pwd.equals(user.getPassword())) {
			request.setAttribute("uname", uname);
//			request.setAttribute("email", user.get);
//			request.setAttribute("uname", uname);
			rd=request.getRequestDispatcher("/Welcome.jsp");
			rd.forward(request, response);
		}
		
		   
		else {
			rd=request.getRequestDispatcher("/error.jsp");
			rd.forward(request, response);
			
		}
			
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
