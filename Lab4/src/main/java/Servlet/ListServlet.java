package Servlet;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Item;

/**
 * Servlet implementation class ListServlet
 */
@WebServlet ("/danhsach")
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ListServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String url = request.getRequestURI();
		List<Item> items = Arrays.asList(new Item[] {
				new Item(1,"Macbook", "mac.jpg", 2100, 0.1),
				new Item(2,"Ipad mini", "ipad.png", 2000, 0.1),
				new Item(3,"Ipad pro", "ipad2.jpg", 900, 0.1),
				new Item(4,"Iphone 14Pro", "iphone.jpg", 1500, 0.1),
				new Item(5,"Acer Nitro 5", "acer.jpg", 950, 0.1),
				new Item(6,"MSI GS 77", "msi.jpg", 200, 0.1) });
		if (url.contains("detail")) {
			int index = Integer.valueOf(url.substring(url.lastIndexOf("/") + 1));
			Item item = items.get(index);
			request.setAttribute("item", item);
			
			request.getRequestDispatcher("/item/detail.jsp").forward(request, response);
		} else {
			request.setAttribute("items", items);
			request.getRequestDispatcher("/item/list.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
