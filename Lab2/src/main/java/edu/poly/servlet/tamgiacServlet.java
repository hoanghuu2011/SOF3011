package edu.poly.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class tamgiavServlet
 */
@WebServlet({ "/tamgiac", "/dientich", "/chuvi" })
public class tamgiacServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public tamgiacServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.getRequestDispatcher("/view/tamgiac.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		double a = Double.parseDouble(request.getParameter("a"));
		double b = Double.parseDouble(request.getParameter("b"));
		double c = Double.parseDouble(request.getParameter("c"));
		
		if( (a + b > c) && (a + c > b) && (b + c > a) ) {
			double chuVi = (a + b + c);
			String uri = request.getRequestURI();
			if(uri.contains("dientich")) { 
			double dienTich = Math.sqrt(chuVi * (a + b - c) * (a + c - b) * (b + c - a))/4;
			request.setAttribute("message", "Diện tích của tam giác là " + dienTich);
			}
			else{ 
			request.setAttribute("message", "Chu vi của tam giác là " + chuVi);
			}
		}
		else {
		request.setAttribute("message",
		"Không thỏa mãn các cạnh của một tam giác!");
		}
		request.getRequestDispatcher("/view/tamgiac.jsp").forward(request, response);
		}
	}


