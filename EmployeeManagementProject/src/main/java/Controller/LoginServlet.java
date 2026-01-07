package Controller;

import java.io.*;
import java.sql.SQLException;
import javax.servlet.*;
import javax.servlet.http.*;

import Bean.LoginBean;
import model.LoginDoa;

public class LoginServlet extends HttpServlet {
    public LoginServlet() {
        super();
 }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("username");
		String pass = request.getParameter("password");
			
		LoginBean lb = new LoginBean(uname,pass);
		
		LoginDoa lm = new LoginDoa();
		RequestDispatcher rd1 = request.getRequestDispatcher("./login.jsp");
		RequestDispatcher rd2 = request.getRequestDispatcher("./home.jsp");
		PrintWriter out = response.getWriter();
			try {
				
				String s = lm.authentication(lb);
				
				if(s.equals("success")) {
					rd2.forward(request, response);
				}
				else {
				request.setAttribute("msg", "Invalid Username or Password..");
					rd1.forward(request, response);
					}
			
				
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
	}

}
