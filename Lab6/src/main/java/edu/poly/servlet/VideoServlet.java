package edu.poly.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


import edu.poly.dao.Videodao;
import edu.poly.model.User;
import edu.poly.utils.JpaUtils;

/**
 * Servlet implementation class VideoServlet
 */
@WebServlet(urlPatterns = { "/cau1", "/cau2", "/cau3", "/cau4", "/cau5", "/cau6", "/cau7",
		"/bai41",})
public class VideoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public VideoServlet() {
		super();
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String url = request.getRequestURI().toString();
		if (url.contains("cau1")) {
			Cau1(request, response);
		} else if (url.contains("cau2")) {
			Cau2(request, response);
		} else if (url.contains("cau3")) {
			Cau3(request, response);
		} else if (url.contains("cau4")) {
			Cau4(request, response);
		}else if (url.contains("cau5")) {
			cau5(request, response);
		}else if (url.contains("cau6")) {
			Cau6(request, response);
		}else if (url.contains("cau7")) {
			Cau7(request, response);
		}else if (url.contains("bai41")) {
			doBai41(request, response);
		}	
	}

	protected void Cau1(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String method = request.getMethod();
		if (method.equalsIgnoreCase("POST")) {
			try {
				EntityManager em = JpaUtils.getEntityManager();
				Videodao vdao = new Videodao();
				String id = request.getParameter("search");
				if (id.equals("")) {
					request.setAttribute("message", "Vui lòng nhập UserID!");
				} else {
					User user = em.find(User.class, id);
					request.setAttribute("user", user);
					request.setAttribute("video", vdao.findVideoFavoriteByUserID(id));
				}
			} catch (Exception e) {
				e.printStackTrace();
				request.setAttribute("error", "Lỗi: " + e.getMessage());
			}
		}
		request.getRequestDispatcher("/views/video.jsp").forward(request, response);
	}

	protected void Cau2(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String method = request.getMethod();
		if (method.equalsIgnoreCase("POST")) {
			try {
				Videodao vdao = new Videodao();
				String keyword = request.getParameter("search");
				if (keyword.equals("")) {
					request.setAttribute("message", "Vui lòng nhập Keyword!");
				} else {
					request.setAttribute("videos", vdao.findVideoFavoriteByKeyword(keyword));
				}
			} catch (Exception e) {
				e.printStackTrace();
				request.setAttribute("error", "Lỗi: " + e.getMessage());
			}
		}
		request.getRequestDispatcher("/views/video.jsp").forward(request, response);
	}

	protected void Cau3(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String method = request.getMethod();
		if (method.equalsIgnoreCase("POST")) {
			try {
				Videodao udao = new Videodao();
				String videoid = request.getParameter("search");
				if (videoid.equals("")) {
					request.setAttribute("message", "Vui lòng nhập VideoID!");
				} else {
					request.setAttribute("videoss", udao.findUserFavoriteByVideoID(videoid));
				}
			} catch (Exception e) {
				e.printStackTrace();
				request.setAttribute("error", "Lỗi: " + e.getMessage());
			}
		}
		request.getRequestDispatcher("/views/video.jsp").forward(request, response);
	}

	protected void Cau4(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String method = request.getMethod();
		if (method.equalsIgnoreCase("POST")) {
			try {
				Videodao vdao = new Videodao();
				boolean favorite = Boolean.parseBoolean(request.getParameter("favorite"));
				request.setAttribute("videos", vdao.findVideoEmpty(favorite));
			} catch (Exception e) {
				e.printStackTrace();
				request.setAttribute("error", "Lỗi: " + e.getMessage());
			}
		}
		request.getRequestDispatcher("/views/video.jsp").forward(request, response);
	}
	protected void cau5(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			Videodao vdao = new Videodao();
			request.setAttribute("report", vdao.countLikeVideo());
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("error", "Lỗi: " + e.getMessage());
		}
		request.getRequestDispatcher("/views/video.jsp").forward(request, response);
	}


	protected void Cau6(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			Videodao vdao = new Videodao();
			String min = request.getParameter("mindate");
			String max = request.getParameter("maxdate");
			if (min.equals("") || max.equals("")) {
				request.setAttribute("message", "Vui lòng chọn ngày tháng nằm!");
			} else {
				request.setAttribute("videos", vdao.findInRange(min, max));
			}
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("error", "Lỗi: " + e.getMessage());
		}
		request.getRequestDispatcher("/views/video.jsp").forward(request, response);
	}
	
	protected void Cau7(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String[] values = request.getParameterValues("months");
			List<Integer> months = new ArrayList<Integer>();
			for (String month : values) {
				months.add(Integer.valueOf(month));
			}
			Videodao vdao = new Videodao();
			request.setAttribute("videos", vdao.findInMonths(months));
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("error", "Lỗi: " + e.getMessage());
		}
		request.getRequestDispatcher("/views/video.jsp").forward(request, response);
	}
	protected void doBai41(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			Videodao vdao = new Videodao();
			request.setAttribute("videos", vdao.random10Video());
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("error", "Lỗi: " + e.getMessage());
		}
		request.getRequestDispatcher("/views/video.jsp").forward(request, response);
	}
	
	
	

}
