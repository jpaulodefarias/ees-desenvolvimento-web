package library.persistence;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import library.entity.Book;

public class BookManager {
	private static EntityManagerFactory emf = PersistenceUtil.getEntityManagerFactory();

	public static List<Book> list() {
		List<Book> books = new ArrayList<>();

		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		books = em.createQuery("select b from Book b", Book.class).getResultList();

		em.getTransaction().commit();
		em.close();

		return books;
	}

	public static void add(Book book) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(book);
		em.getTransaction().commit();
		em.close();
	}

}
