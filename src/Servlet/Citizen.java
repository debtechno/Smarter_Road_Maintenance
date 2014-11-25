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
		String sev=request.getParameter("severity");
		String sm=request.getParameter("summary");
		
		count++;
		
		
		/*HttpSession session=request.getSession();
		String sessionId=session.getId();
		String sessionStatusKey=sessionId+"SessionStatus";*/
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h1>Hi "+un+" Your complain is successfully logged with Summary="+sm+"</h1><br><br>");
		DbConnection db=new DbConnection();
		Connection con = db.doConnection();
		//out.println("<h1>Connection to the database is successful</h1>");
		try{
			PreparedStatement ps=con.prepareStatement("insert into DEBABRATA_MUKHERJEE_IN_IBM_COM.complain(user_name,summary,complain_text,severity,complain_id) values(?,?,?,?,?)");
			ps.setString(1, un);
			ps.setString(2, sm);
			ps.setString(3, complains);
			ps.setString(4, sev);
			ps.setString(5, null);
			int i=ps.executeUpdate();
			System.out.println("Update Successful");
			//out.println("<h1>The values are successfully inserted into the table<h1>");
		}
			catch(SQLException e){
				e.printStackTrace();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		//out.println("<h1>Your complain is added to the database <br>");	
		
		
		RequestDispatcher view=request.getRequestDispatcher("ComplainSuccessful.jsp");
		view.forward(request, response);
	}

}
