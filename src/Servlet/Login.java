package Servlet;

import java.io.IOException;
import java.sql.Connection;
import java.util.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import model.Credentials;
import model.DbConnection;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String un=request.getParameter("user");
		String pw=request.getParameter("password");
		DbConnection db=new DbConnection();
		Connection con = db.doConnection();
		Map<String,String>m=new HashMap<String,String>();
		m.put("Deb", "deb123");
		m.put("Shankha", "shank123");
		m.put("Ani", "ani123");
		m.put("kmc", "kmc123");
		m.put("kmda", "kmda123");
		m.put("pwd", "pwd123");
		m.put("LandT", "lt123");
		/*HttpSession session=request.getSession();
		String sid=session.getId();	
		session.setAttribute("Active Session ", sid);*/
		if((m.containsKey(un))&&(m.containsValue(pw))){
			RequestDispatcher view=request.getRequestDispatcher("Logon.jsp");
			view.forward(request, response);
		}
		else{
			RequestDispatcher view=request.getRequestDispatcher("Error.jsp");
			view.forward(request, response);
		}
		
	}

}
