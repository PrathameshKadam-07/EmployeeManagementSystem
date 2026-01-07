package Controller;
import java.util.List;
import java.util.ArrayList;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.EmpBean;
import model.EmpDoa;

public class viewAllServlet extends HttpServlet {
       
    public viewAllServlet() {
        super();
  }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		EmpDoa ed = new EmpDoa();
		RequestDispatcher rd = request.getRequestDispatcher("./View_2ndWay.jsp");
	
	try {
		List<EmpBean> list = ed.viewAll();
		request.setAttribute("empList", list);
		rd.forward(request, response);
		
		
	} catch (ClassNotFoundException | SQLException e) {
		
		e.printStackTrace();
	}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
