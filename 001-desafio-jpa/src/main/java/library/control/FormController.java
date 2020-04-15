package library.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import library.entity.Book;
import library.persistence.BookManager;

@WebServlet("/Book")
public class FormController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String title = req.getParameter("title");
		String author = req.getParameter("author");
		String summary = req.getParameter("summary");
		String year = req.getParameter("year");
		
		Book book = new Book(title, author, summary, year);
		
		BookManager.add(book);
		
		resp.sendRedirect("/");
	}

}
