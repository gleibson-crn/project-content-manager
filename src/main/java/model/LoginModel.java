package model;

import java.io.Serializable;
import java.util.Objects;

public class LoginModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String login;
	private String password;
		
	public LoginModel() {
	}
	
	public LoginModel(String login, String password) {
		this.login = login;
		this.password = password;
	}

	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
		
	@Override
	public int hashCode() {
		return Objects.hash(login, password);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoginModel other = (LoginModel) obj;
		return Objects.equals(login, other.login) && Objects.equals(password, other.password);
	}

	@Override
	public String toString() {
		return "LoginModel [login=" + login + ", password=" + password + "]";
	}
	
	

}
