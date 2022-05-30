package net.javaguides.registration.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import net.javaguides.registration.dao.BookDao;
import net.javaguides.registration.model.Book;

import java.io.IOException;

import javax.servlet.RequestDispatcher;

/**
 * Servlet implementation class BookServlet
 */
@WebServlet("/book")
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BookDao bookDao = new BookDao();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		jakarta.servlet.RequestDispatcher ds = request.getRequestDispatcher("WEB-INF/views/libraryregister.jsp");
		ds.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idBook = request.getParameter("idBook");
		String name = request.getParameter("name");
		String pages = request.getParameter("pages");
		String author = request.getParameter("author");
		
		Book book = new Book();
		book.setIdBooks(idBook);
		book.setIdBooks(name);
		book.setIdBooks(pages);
		book.setIdBooks(author);
		
		try {
			bookDao.registerBook(book);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		jakarta.servlet.RequestDispatcher ds = request.getRequestDispatcher("WEB-INF/views/bookdetails.jsp");
		ds.forward(request, response);
	}

}
