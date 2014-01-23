package by.coolbuy.trash;
//from dao
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@SuppressWarnings({ "unchecked", "rawtypes" })
public class UserDAOImpl {

	@Autowired
	//@Resource(name="mySessionFactory")
	private SessionFactory sessionFactory;

	protected static Logger logger = Logger.getLogger("dao");

	/**
	 * @Transactional annotation below will trigger Spring Hibernate transaction
	 *                manager to automatically create a hibernate session. See
	 *                src/main/webapp/WEB-INF/action-servlet.xml
	 */
	@Transactional
	public List<User> findAll() {
		logger.debug("get all users");
		Session session = sessionFactory.getCurrentSession();
		List users = session.createQuery("from User").list();
		return users;
	}

	@Transactional
	public User find(String email) {
		logger.debug("find one user");
		Session session = sessionFactory.getCurrentSession();
		User user = (User) session.get(User.class, email);
		return user;
	}

	@Transactional
	public void add(User user) {
		logger.debug("Adding new user");

		// Retrieve session from Hibernate
		Session session = sessionFactory.getCurrentSession();

		// Save
		session.save(user);
		
	}

}
