package model;

import java.util.Properties;

import javax.mail.*;
import javax.mail.internet.*;
public class SendEmail {
	
	String to;
public void sendMail(String to){	
	  
	      // Recipient's email ID needs to be mentioned.
	      

	      // Sender's email ID needs to be mentioned
	      String from="debabrata.mukherjee@in.ibm.com";

	      // Assuming you are sending email from localhost
	      String host = "75.126.155.142:50000";

	      // Get system properties
	      Properties properties = System.getProperties();

	      // Setup mail server
	      properties.setProperty("mail.smtp.host", host);

	      // Get the default Session object.
	      Session session = Session.getDefaultInstance(properties);

	      try{
	         // Create a default MimeMessage object.
	         MimeMessage message = new MimeMessage(session);

	         // Set From: header field of the header.
	         message.setFrom(new InternetAddress(from));

	         // Set To: header field of the header.
	         message.addRecipient(Message.RecipientType.TO,
	                                  new InternetAddress(to));

	         // Set Subject: header field
	         message.setSubject("Complain Ackowledgement");

	         // Now set the actual message
	         message.setText("Your complain is received");

	         // Send message
	         Transport.send(message);
	         System.out.println("Sent message successfully....");
	      }catch (MessagingException mex) {
	         mex.printStackTrace();
	      }
}
}