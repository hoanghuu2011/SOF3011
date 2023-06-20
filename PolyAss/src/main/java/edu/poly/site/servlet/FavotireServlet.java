package edu.poly.site.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.poly.common.PageInfo;
import edu.poly.common.PageType;
import edu.poly.common.SessionUtils;
import edu.poly.dao.FavoriteDao;
import edu.poly.model.Video;

/**
 * Servlet implementation class FavotireServlet
 */
@WebServlet("/FavotireServlet")
public class FavotireServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		String username = SessionUtils.getLoginedUsername(request);
		FavoriteDao dao = new FavoriteDao();
		if (username != null) {
			List<Video> list = dao.findAllByUserId(username);
			if (list.size() > 0) {
				request.setAttribute("listVideo", list);
				request.setAttribute("username", username);
				PageInfo.prepareAndForwardSite(request, response, PageType.SITE_FAVORITE_PAGE);

			} else {
				request.setAttribute("message", "Bạn chưa yêu thích video nào vùi lòng quay lại sau");
				request.setAttribute("username", username);
				request.getRequestDispatcher("/site/common/404.jsp").forward(request, response);
			}
		} else {
			request.getRequestDispatcher("/Login").forward(request, response);
		}
		//PageInfo.prepareAndForwardSite(request, response, PageType.SITE_FAVORITE_PAGE);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
	}

}
