package com.epam.sapryka;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

@Mojo(name = "run")
public class SendEmail extends AbstractMojo 
{

    @Parameter(property = "username")
    private String username;
    @Parameter(property = "password")
    private String password;
    @Parameter(property = "subject")
    private String subject;
    @Parameter(property = "text")
    private String text;

    public void execute() throws MojoExecutionException, MojoFailureException {
        Properties properties = System.getProperties();
        properties.put("mail.smtp.host", "smtp.mail.ru");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

        Session session = Session.getInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        System.out.println("Start sending emails!");
		
		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(username));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(username));
			message.setSubject(subject);
			message.setText(text);

			System.out.println("Sending message!");

			Transport.send(message);
			System.out.println("Message sent successfully!");
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
    }
}