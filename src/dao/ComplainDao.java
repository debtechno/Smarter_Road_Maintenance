package dao;
import model.*;
import java.sql.*;
import Servlet.*;
import dao.*;

public class ComplainDao {
Citizen ct=new Citizen();
PreparedStatement ps=null;
int i;
public int logComplain(Connection con, Complain c){
	try{
		
		ps=con.prepareStatement("insert into DEBABRATA_MUKHERJEE_IN_IBM_COM.complain (user_name, summary, complain_text, severity, complain_id) values (?,?,?,?,?)");
		ps.setString(1, c.getUser_name());
		ps.setString(2, c.getSummary());
		ps.setString(3, c.getComplains());
		//ps.setInt(4, c.getSeverity());
		ps.setInt(4, 1);
		ps.setInt(5, ct.count);
		i = ps.executeUpdate();
		System.out.println("AFTER INSERT " + ps);
		con.commit();
	
	}
	catch(SQLException e){
		e.printStackTrace();
	}
	catch(Exception e){
		e.printStackTrace();
	}
	return i;
}
}

