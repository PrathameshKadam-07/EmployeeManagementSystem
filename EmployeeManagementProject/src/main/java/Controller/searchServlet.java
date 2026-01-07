package Controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Bean.EmpBean;
import model.EmpDoa;

public class searchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public searchServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int eno = Integer.parseInt(request.getParameter("eno")) ;

		EmpBean eb = new EmpBean(eno);
		EmpDoa ed = new EmpDoa();
		RequestDispatcher rd = request.getRequestDispatcher("./empSer.jsp");
		
		try {
			ed.searchEmp(eb);
			rd.forward(request, response);
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doGet(request, response);
	}

}
