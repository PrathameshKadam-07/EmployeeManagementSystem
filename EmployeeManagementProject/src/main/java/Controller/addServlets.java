package Controller;
import Bean.EmpBean;
import model.EmpDoa;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class addServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public addServlets() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int eno = Integer.parseInt(request.getParameter("eno")) ;
		String ename = request.getParameter("ename");
		int esal = Integer.parseInt(request.getParameter("esal")) ;

		EmpBean eb = new EmpBean(eno,ename,esal);
		EmpDoa ed = new EmpDoa();
		RequestDispatcher rd = request.getRequestDispatcher("./addEmp.jsp");

try {
	int n = ed.insertEmp(eb);
	if(n != 0) 
	{
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
