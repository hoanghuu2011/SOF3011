package edu.poly.servlet;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SendMailServlet
 */
@WebServlet("/SendMailServlet")
public class SendMailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/view/sendmail.jsp").forward(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");

		final String username = "huu2813@gmail.com";
		final String password = "ajsmvbkiezhdlwuq";

		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");

		// Get the Session object.
		Session s = Session.getInstance(props, new javax.mail.Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});
		String toemail = req.getParameter("to");
		String subject = req.getParameter("subject");
		String content = req.getParameter("content");
		try {
			Message msg = new MimeMessage(s);
			msg.setFrom(new InternetAddress(username));
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(toemail));
			msg.setSubject(subject);
			msg.setText(content);
			Transport.send(msg);
		} catch (Exception e) {
		}
		// kiểm tra gửi mail
		if (toemail.equalsIgnoreCase("") || subject.equalsIgnoreCase("") || content.equalsIgnoreCase("")) {
			req.setAttribute("message", "Vui lòng nhập đẩy đủ!");
		} else {
			req.setAttribute("message", "Gửi email thành công!");
		}
		req.getRequestDispatcher("/view/sendmail.jsp").forward(req, resp);
	}

}
