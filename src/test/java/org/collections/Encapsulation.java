package org.collections;

public class Encapsulation {

	private String username;

	private String password;

	public void setUsername(String username) {
		if (username.equals("Kishore")) {
			this.username = "valid username";
		} else if (username.equals("Ram")) {
			this.username = "valid username";
		} else {
			this.username = "Invalid Username";
		}
	}

	public void setPassword(String password) {
		if (password.equals("kishore@123")) {
			this.password = "valid password";
		} else if (password.equals("Ram@123")) {
			this.password = "valid password";
		} else {
			this.username = "Invalid Password";
		}
	}

	public String getUsername() {
		if (username.equals("valid username")) {
			return "1";
		} else {
			return "0";
		}
	}

	public String getPassword() {
		if (password.equals("valid password")) {
			return "1";
		} else {
			return "0";
		}
	}
}
