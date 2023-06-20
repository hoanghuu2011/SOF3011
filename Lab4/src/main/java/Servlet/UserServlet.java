package Servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet(urlPatterns = { "/user" })
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static List<User> listUser = new ArrayList<User>();

	public UserServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// chia sẻ dữ liệu cho jsp
		request.getRequestDispatcher("/user/index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String username = request.getParameter("username").toString();
		String password = request.getParameter("password").toString();
		Boolean remember = null;
		if (request.getParameter("remember") == null) {
			remember = false;
		} else {
			remember = true;
		}
		if (username == null || password == null) {
			request.setAttribute("message", "Tên đăng nhập và mật khẩu đều không được để trống!");
		} else {
			request.setAttribute("message", "Thêm thành công!");
			listUser.add(new User(username, password, remember));
			request.setAttribute("items", listUser);
		}
		request.getRequestDispatcher("/user/index.jsp").forward(request, response);
	}

}
