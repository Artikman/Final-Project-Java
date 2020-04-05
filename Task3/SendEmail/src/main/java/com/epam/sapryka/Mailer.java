package com.epam.sapryka;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class Mailer {

    private String username;
    private String password;
    private Properties properties;

    public Mailer(String username, String password) {
        this.username = username;
        this.password = password;

        Properties properties = System.getProperties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.mail.ru");
        properties.put("mail.smtp.port", "587");
    }

    public void send(String subject, String text, String toEmail) {
        Session session = Session.getInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(username));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
			message.setSubject(subject);
			message.setText(text);

			System.out.println("Sending message!");

			Transport.send(message);
			System.out.println("Message sent successfully!");
		} catch(MessagingException e) {
			throw new RuntimeException(e);
		}
    }
}