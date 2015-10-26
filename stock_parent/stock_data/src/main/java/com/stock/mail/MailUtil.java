package com.stock.mail;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

import org.springframework.core.io.PathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

public class MailUtil {
	
	private transient MailAuthenticator authenticator;
	
	private transient Session session;
	
	
	
	public void sentMail(String receiver,String subject,Object content){
		
		
		
		
		Message msg = new MimeMessage(session);
		
		try {
			//设置发件人
			msg.setFrom(new InternetAddress(authenticator.getAccount()));
			//设置收件人
			msg.setRecipient(RecipientType.TO, new InternetAddress(receiver));
			//设置邮件主题
			msg.setSubject(subject);
			//设置邮件内容
			msg.setContent(content, "text/html;charset=utf-8");
			
			Transport.send(msg);
		} catch (AddressException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}
	
	public void init(){
		Resource resource = new PathResource("common.properties");
		
		
		Properties props = null;
		try {
			props = PropertiesLoaderUtils.loadProperties(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
		props.setProperty("mail.smtp.host", props.getProperty("mail.smtp.host"));
		
		
		session = Session.getDefaultInstance(props);
	}

}
