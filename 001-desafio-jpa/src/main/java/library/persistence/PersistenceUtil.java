package library.persistence;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceUtil {

	private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("library");

	public static EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}

}
