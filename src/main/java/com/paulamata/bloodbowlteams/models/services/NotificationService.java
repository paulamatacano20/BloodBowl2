package com.paulamata.bloodbowlteams.models.services;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
	
	@Autowired
	private JavaMailSender javaMailSender;
		
	
	public void sendNotification(String usuario) throws MailException{
		
		Properties prop = new Properties();
		
		System.out.println("............................................................................"+prop.get("spring.mail.host"));
		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setTo(usuario);
		mail.setFrom("paulisken@gmail.com");
		mail.setSubject("Recuperación de contraseña");
		mail.setText("Su contraseña es ninguna");

		
		javaMailSender.send(mail);
		
	}
}
