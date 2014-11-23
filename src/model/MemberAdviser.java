package model;
import java.util.*;

public class MemberAdviser {
	
public List getOptions(String type){
	List options=new ArrayList();
	if(type.equals("Citizen")){
		options.add("Report damage");
		options.add("Track your complain status");
		options.add("Logout");
		options.add("Deregister");
	}
	else{
		options.add("View complaints");
		options.add("Update status");
		options.add("Logout");
	}
	return(options);
}
}
