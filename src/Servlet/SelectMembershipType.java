package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import model.MemberAdviser;

/**
 * Servlet implementation class SelectMembershipType
 */
@WebServlet({ "/SelectMembershipType", "/SelectOption.do" })
public class SelectMembershipType extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectMembershipType() {
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
	String s=request.getParameter("type");
	MemberAdviser m=new MemberAdviser();
	List result=m.getOptions(s);
	/*response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	out.println("Your chosen membership type is <br>");*/
	request.setAttribute("Styles", result);
	RequestDispatcher view=request.getRequestDispatcher("HomePage.jsp");
	view.forward(request, response);
	}

}
