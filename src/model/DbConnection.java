package model;

import java.sql.*;
import java.sql.*;

public class DbConnection {
private String url="jdbc:db2://75.126.155.142:50000/I_380970";
private String un="kuzpinms";
private String pw="qdmtnrlzvvwr";
private int port=50000;
public Connection doConnection(){
	Connection con=null;
	try{
	Class.forName("com.ibm.db2.jcc.DB2Driver");
	con=DriverManager.getConnection(url, un, pw);
	
}
	catch(ClassNotFoundException e){
		e.printStackTrace();
		
	}
	catch(SQLException e){
		e.printStackTrace();
		
	}
	return con;
}
}
