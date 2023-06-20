package poly.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class chunhat
 */
@WebServlet("/chunhat")
public class chunhatServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public chunhatServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("/view/chunhat/chunhat.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String chieudai = request.getParameter("dai");
		String chieurong = request.getParameter("rong");
		double dai = Double.parseDouble(chieudai);
		double rong = Double.parseDouble(chieurong);
		double dt = dai * rong;
		double cv = (dai + rong) * 2;
		
		request.setAttribute("kq1", "Dien tich: " + dt);
		request.setAttribute("kq2", "Chu vi: " + cv);
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("/view/chunhat/ketqua.jsp").forward(request,response);



	}

}
