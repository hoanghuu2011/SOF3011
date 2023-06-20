package edu.poly.site.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;

import edu.poly.common.CookieUtils;
import edu.poly.common.PageInfo;
import edu.poly.common.PageType;
import edu.poly.common.SessionUtils;
import edu.poly.dao.UserDao;
import edu.poly.domain.LoginForm;
import edu.poly.model.User;





/**
 * Servlet implementation class AccountServlet
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		String username = CookieUtils.get("username", request);
		// lấy giá trị của cookie "username" 
		if (username == null) {
			
			request.getRequestDispatcher("/site/users/sign-in.jsp").forward(request, response);
			//PageInfo.prepareAndForwardSite(request, response, PageType.SITE_LOGIN_PAGE);
			return;
		}
		SessionUtils.add(request, "username", username);
		//Nếu cookie "username" đã tồn tại, nó sẽ được lưu vào đối tượng Session
		PageInfo.prepareAndForwardSite(request, response, PageType.SITE_HOME_PAGE);
		
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		try {
			LoginForm form = new LoginForm();
			BeanUtils.populate(form, request.getParameterMap());
		////đổ giữ liệu trên form vào cho đối tượng form
			UserDao dao = new UserDao();
			User user = dao.findById(form.getUsername());
			if (user != null && user.getPassword().equals(form.getPassword())) {
				SessionUtils.add(request, "username", user.getUsername());
				SessionUtils.add(request, "fullname", user.getFullname());
				SessionUtils.add(request, "admin", user.getAdmin());
				if (form.isRemember()) {
					CookieUtils.add("username", form.getUsername(), 24, response);
				} else {
					CookieUtils.add("username", form.getUsername(), 0, response);
				}
				request.setAttribute("isLogin", true);
				request.setAttribute("name", user.getFullname());
				request.getRequestDispatcher("/Homepages").forward(request, response);
				return;
			}
			request.setAttribute("error", "Invalid username or password");
		} catch (Exception e) {
			request.setAttribute("error", e.getMessage());
		}
		request.getRequestDispatcher("/site/users/sign-in.jsp").forward(request, response);

	}


}
