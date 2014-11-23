package model;

public class Credentials {
	
	private String user_name;
	private String password;
	public Credentials(String un, String pw){
		this.user_name=un;
		this.password=pw;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
