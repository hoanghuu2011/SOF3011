package edu.poly.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class demo
 */
@WebServlet("/demo")
public class demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public demo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/view/demo/test.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String married = request.getParameter("married");
		String nationality = request.getParameter("nationality");
		
		String[] favorites = request.getParameterValues("favorites");
		String note = request.getParameter("note");
		
		request.setAttribute("username", username);
		request.setAttribute("password", password);
		request.setAttribute("gender", gender);
		request.setAttribute("married", married);
		request.setAttribute("nationality", nationality);
		
		StringBuilder sb = new StringBuilder();
		for(String item :favorites ) {
			sb.append(item).append(" ,");
			
		}
		request.setAttribute("favorites", sb.toString());
		request.setAttribute("note", note);
		
		request.getRequestDispatcher("/view/demo/test.jsp").forward(request, response);
		
	}

}
