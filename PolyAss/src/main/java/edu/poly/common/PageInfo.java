package edu.poly.common;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.collections.map.HashedMap;

public class PageInfo {
	public static Map<PageType, PageInfo> pageRoute = new HashedMap();
		static {
			
			// admin
			pageRoute.put(PageType.USER_MANAGEMENT_PAGE,
					new PageInfo("User Management", "/admin/users/users.jsp", null));
			pageRoute.put(PageType.REPORTS_MANAGEMENT_PAGE,
					new PageInfo("Reports", "/admin/reports/reports.jsp", null));
			pageRoute.put(PageType.VIDEO_MANAGEMENT_PAGE,
					new PageInfo("Video Management", "/admin/videos/videos.jsp", null));
			
			// site
			pageRoute.put(PageType.SITE_HOME_PAGE, new PageInfo("Home", "/site/home/home.jsp", null));
			pageRoute.put(PageType.SITE_LOGIN_PAGE, new PageInfo("Login", "/site/users/sign-in.jsp", null));
			pageRoute.put(PageType.SITE_Login2_PAGE, new PageInfo("Login", "/site/users/login.jsp", null));
			pageRoute.put(PageType.SITE_REGISTRATION_PAGE,
					new PageInfo("Registration", "/site/users/registration.jsp", null));
			pageRoute.put(PageType.SITE_CHANGEPASS_PAGE,
					new PageInfo("Change Password", "/site/users/change-password.jsp", null));
			pageRoute.put(PageType.SITE_EDIT_PROFILE_PAGE,
					new PageInfo("Edit Profile", "/site/users/edit-profile.jsp", null));
			pageRoute.put(PageType.SITE_FAVORITE_PAGE, new PageInfo("Favorite", "/site/videos/favorite.jsp", null));
			pageRoute.put(PageType.SITE_FORGOT_PASSWORD_PAGE,
					new PageInfo("Forgot Password", "/site/users/forgot-password.jsp", null));
			pageRoute.put(PageType.SITE_SHARE_PAGE, new PageInfo("Share", "/site/videos/share.jsp", null));
			pageRoute.put(PageType.SITE_VIDEO_DETAIL_PAGE,
					new PageInfo("Video Detail", "/site/videos/detail.jsp", null));
		}
		public static void prepareAndForward(HttpServletRequest request, HttpServletResponse response, PageType pageType)
				throws ServletException, IOException {
			PageInfo page = pageRoute.get(pageType);
			request.setAttribute("page", page);
			/*
			 * request.getRequestDispatcher("/admin/layout.jsp").forward(request, response);
			 */
			request.getRequestDispatcher("/layout.jsp").include(request, response);
		}
		public static void prepareAndForwardSite(HttpServletRequest request, HttpServletResponse response,
				PageType pageType) throws ServletException, IOException {
			PageInfo page = pageRoute.get(pageType);
			request.setAttribute("page", page);
			request.getRequestDispatcher("/layout.jsp").include(request, response);

		}
	
	private String title;
	private String contentUrl;
	private String scriptUrl;
	
	public PageInfo(String title, String contentUrl, String scriptUrl) {
		super();
		this.title = title;
		this.contentUrl = contentUrl;
		this.scriptUrl = scriptUrl;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContentUrl() {
		return contentUrl;
	}
	public void setContentUrl(String contentUrl) {
		this.contentUrl = contentUrl;
	}
	public String getScriptUrl() {
		return scriptUrl;
	}
	public void setScriptUrl(String scriptUrl) {
		this.scriptUrl = scriptUrl;
	}
	
}
