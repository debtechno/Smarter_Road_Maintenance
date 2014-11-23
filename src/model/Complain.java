package model;

public class Complain {

	private String complains;
	private Integer severity;
	private String user_name;
	private String summary;
	private Integer complain_id;
	
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public Integer getComplain_id() {
		return complain_id;
	}
	public void setComplain_id(Integer complain_id) {
		this.complain_id = complain_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getComplains() {
		return complains;
	}
	public void setComplains(String complains) {
		this.complains = complains;
	}
	public Integer getSeverity() {
		return severity;
	}
	public void setSeverity(Integer severity) {
		this.severity = severity;
	}
	
}
