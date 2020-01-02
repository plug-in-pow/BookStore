
package bookstore;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Session; 
import javax.mail.PasswordAuthentication;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Transport;
//import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class NewClass {
    public static void sendEmail(String recepient) throws Exception{
        System.out.println("Preaparing to  send .. ");
        Properties p = new Properties();
        
        p.put("mail.smtp.auth","true");
        p.put("mail.smtp.starttls.enable","true");
        p.put("mail.smtp.host","smtp.gmail.com");
        p.put("mail.smtp.port","587");
        
        String myAcc = "tripathimayank36@gmail.com";
        String password = "einsteinbst";
        
        Session session = Session.getInstance(p, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(myAcc,password);
            }
        });
        
        prepareMessage(session,myAcc,recepient);

        
        
        System.out.println("Message send .. ");
    }
    
    private static Message prepareMessage(Session session, String myAcc , String recepient){
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAcc));
            message.addRecipient(Message.RecipientType.TO,new InternetAddress(recepient));
            message.setSubject("My First email");
            message.setText("hii there , \n Congrats a lot");
            Transport.send(message);
            return null;
        } catch (Exception ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
