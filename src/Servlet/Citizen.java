package Servlet;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import dao.ComplainDao;
import model.*;

import java.sql.*;
import java.util.*;
/**
 * Servlet implementation class Citizen
 */
@WebServlet("/Citizen")
public class Citizen extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public Integer count=100;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Citizen() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ComplainDao cd= new ComplainDao();
		
		String complains=request.getParameter("NewComplain");
		String un=request.getParameter("user_name");
		//String sev=request.getParameter("severity");
		String sm=request.getParameter("summary");
		
		count++;
		/*HttpSession session=request.getSession();
		String sessionId=session.getId();
		String sessionStatusKey=sessionId+"SessionStatus";*/
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h1>Hi "+un+" Your complain is successfully logged with complain id: "+count+"<br> Summary="+sm+"</h1><br><br>");
		DbConnection db=new DbConnection();
		Connection con = db.doConnection();
		out.println("<h1>Connection to the database is successful</h1>");
		Complain c=new Complain();
		cd.logComplain(con, c);
		out.println("<h1>Your complain is added to the database <br>");		
		
		/*RequestDispatcher view=request.getRequestDispatcher("ComplainSuccessful.jsp");
		view.forward(request, response);*/
	}

}
