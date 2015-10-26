package com.stock.mail;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class MailAuthenticator  extends Authenticator{
	
	private String account;
	private String password;
	
	public MailAuthenticator(String _account,String _password){
		this.account = _account;
		this.password = _password;
	}
	
	@Override
	protected PasswordAuthentication getPasswordAuthentication() {
		
		
		return new PasswordAuthentication(account, password);
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
