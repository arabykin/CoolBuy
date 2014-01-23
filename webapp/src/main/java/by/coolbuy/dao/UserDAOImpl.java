package by.coolbuy.dao;
//from dao
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import by.coolbuy.model.User;

@Repository
@SuppressWarnings({ "unchecked", "rawtypes" })
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
}

	protected static Logger logger = Logger.getLogger("dao");

	
	@Override
	public void createUser(User user) {
		logger.debug("Adding new user");

		getCurrentSession().save(user);
		
	}

	@Override
	public User getUserById(int userId) {
		logger.debug("find one user by user_id");		
		User user = (User) getCurrentSession().get(User.class, userId);
		return user;
	}

	@Override
	public User getUserByEmail(String email) {
		logger.debug("find one userby email");		
		User user = (User) getCurrentSession().get(User.class, email);
		return user;
	}

	@Override
	public List<User> getUsers() {
		logger.debug("get all users");		
		List users = getCurrentSession().createQuery("from User").list();
		return users;
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

}
