package edu.poly.site.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import edu.poly.common.PageInfo;
import edu.poly.common.PageType;
import edu.poly.common.SessionUtils;
import edu.poly.dao.UserDao;
import edu.poly.domain.ChangePasswordForm;



/**
 * Servlet implementation class ChangepasswordServlet
 */
@WebServlet("/ChangepasswordServlet")
public class ChangepasswordServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String username = SessionUtils.getLoginedUsername(request);
		if (username == null) {
      		request.getRequestDispatcher("/Login").forward(request, response);
			return;
		}
		request.setAttribute("username", username);
		PageInfo.prepareAndForwardSite(request, response, PageType.SITE_CHANGEPASS_PAGE);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		try {
			String username = SessionUtils.getLoginedUsername(request);// lấy tên đăng nhập của người dùng từ session
			ChangePasswordForm form = new ChangePasswordForm();
			BeanUtils.populate(form, request.getParameterMap());
			String currentpassword = request.getParameter("currentPassword");
			form.setCurrentPassword(currentpassword);// lấy giá trị của trường currentPassword từ request và cập nhật vào đối tượng form.
			request.setAttribute("username", username);
			if (!form.getConfirmPassword().equals(form.getPassword())) {
				//kiểm tra xem 2 trường này giống nhau ko nếu ko thì nến ra ngoại lệ
				request.setAttribute("error", "Mật khẩu mới và xác nhận mật khẩu  mới không khớp.");
			} else {
				UserDao dao = new UserDao();
				dao.changePassword(form.getUsername(), form.getCurrentPassword(), form.getPassword());
				request.setAttribute("message", "Đôi pass thành công!");
			}
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("error", "Error: " + e.getMessage());
		}
		PageInfo.prepareAndForwardSite(request, response, PageType.SITE_CHANGEPASS_PAGE);
	}
	}


