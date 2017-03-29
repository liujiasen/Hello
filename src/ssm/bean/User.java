package ssm.bean;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
	
	
	private int id;
	
	@NotNull
	@Size(min=5,max=16,message="{userName.size}")
	private String userName;
	@NotNull
	@Size(min=5,max=25,message="{password.size}")
	private String password;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
