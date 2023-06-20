package edu.poly.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.poly.Dao.UserDao;
import edu.poly.model.User;



@WebServlet("/InsertServlet")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			User user = new User();
			user.setAdmin(true);
			user.setEmail("huuvvhpd06670@fpt.edu.vn");
			user.setPassword("2003");
			user.setUserId("vvhh2003");
			
			UserDao dao= new UserDao();
			dao.insertUser(user);
			
			response.getWriter().println("<h1>Thanh cong</h1>");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
