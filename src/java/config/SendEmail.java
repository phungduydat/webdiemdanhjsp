/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import javax.mail.Address;
import javax.mail.PasswordAuthentication;
import java.util.Date;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.activation.DataSource;
import javax.activation.DataHandler;

/**
 *
 * @author duyda
 */
public class SendEmail {

    public  void send(String to , String text) {
        // password = afkolkwwznyfewrh
        final String from = "maydiemdanhonl@gmail.com";
        final String password = "afkolkwwznyfewrh";

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.ssl.trust", "stmp.gmail.com");

        Authenticator auth = new Authenticator() {
            @Override
            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                return new javax.mail.PasswordAuthentication(from, password); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
            }
        };

        Session session = Session.getInstance(props, auth);
        MimeMessage msg = new MimeMessage(session);
        try {
            msg.addHeader("Content-type", "text/html; charset=UTF-8");
            msg.setFrom(new InternetAddress("from-maydiemdanhonl@gmail.com"));
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to, false));
            msg.setSubject("MẬT KHẨU MỚI CỦA BAN LA :");
            msg.setSentDate(new Date());
            msg.setText("day la mat khau moi cua ban "+text, "UTF-8");
            Transport.send(msg);
            System.out.println("done");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
