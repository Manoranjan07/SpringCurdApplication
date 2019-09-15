package com.sca.entities;

public class Ticketbook {

	private String user;
	private String pass;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getAcccount() {
		return acccount;
	}

	public void setAcccount(String acccount) {
		this.acccount = acccount;
	}

	private String acccount;

	@Override
	public String toString() {
		return "Ticketbook [user=" + user + ", pass=" + pass + ", acccount="
				+ acccount + "]";
	}
	

}
