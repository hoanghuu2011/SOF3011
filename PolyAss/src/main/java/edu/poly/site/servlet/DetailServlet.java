package edu.poly.site.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.poly.common.PageInfo;
import edu.poly.common.PageType;
import edu.poly.common.SessionUtils;

import edu.poly.dao.FavoriteDao;

import edu.poly.dao.VideoDao;
import edu.poly.model.Favorite;
import edu.poly.model.Video;

/**
 * Servlet implementation class DetailServlet
 */
@WebServlet("/admin/detail")
public class DetailServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		String username = SessionUtils.getLoginedUsername(request);
		String videoId = request.getParameter("videoId");
		VideoDao dao = new VideoDao();
		Video video = dao.findById(videoId);
		if (username != null) {
			FavoriteDao favdao = new FavoriteDao();
			Favorite fav = favdao.findOneByUserIdAndVideoId(username, videoId);
			request.setAttribute("favorite", fav);
			request.setAttribute("username", username);
		} else {
		    request.getRequestDispatcher("/Login").forward(request, response);
			return;
		}
		request.setAttribute("video", video);
		
		PageInfo.prepareAndForwardSite(request, response, PageType.SITE_VIDEO_DETAIL_PAGE);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		doGet(request, response);
	}

}
