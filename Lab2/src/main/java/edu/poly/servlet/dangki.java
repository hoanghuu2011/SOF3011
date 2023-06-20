package edu.poly.servlet;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class dangki
 */
@WebServlet("/dangki")
public class dangki extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dangki() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.getRequestDispatcher("/view/dangki/form.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String username = request.getParameter("username");
		boolean gender = Boolean.parseBoolean(request.getParameter("gender"));
		if (Boolean.parseBoolean(request.getParameter("gender")) == true) {
			request.setAttribute("gender", "Nam");
		} else {
			request.setAttribute("gender", "Nữ");
		}
		boolean married = (request.getParameter("married") != null);
		if (request.getParameter("married") != null) {
			request.setAttribute("married", "Đã kết hôn");
		} else {
			request.setAttribute("married", "Chưa kết hôn");
		}
		String country = request.getParameter("country");
		String[] hobbies = request.getParameterValues("hobbies");
		request.setAttribute("hobbies", Arrays.toString(hobbies));

		System.out.println("> username: " + username);
		System.out.println("> gender: " + gender);
		System.out.println("> married: " + married);
		System.out.println("> country: " + country);
		System.out.println("> hobbies: " + Arrays.toString(hobbies));

		request.getRequestDispatcher("/view/dangki/result.jsp").forward(request, response);


	}

}
