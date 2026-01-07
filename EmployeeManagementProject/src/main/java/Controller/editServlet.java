package Controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.EmpBean;
import model.EmpDoa;

public class editServlet extends HttpServlet {

    public editServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int eno = Integer.parseInt(request.getParameter("eno")) ;
		String eame = request.getParameter("ename");
		int esal = Integer.parseInt(request.getParameter("esal")) ;

		EmpBean eb = new EmpBean(eno,eame,esal);
		EmpDoa ed = new EmpDoa();
		RequestDispatcher rd = request.getRequestDispatcher("./editEmp.jsp");
		try {
			int n = ed.editEmp(eb);
			if(n !=0) {
				rd.forward(request, response);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doGet(request, response);
	}

}
