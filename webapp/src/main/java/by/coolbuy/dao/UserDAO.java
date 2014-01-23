package by.coolbuy.dao;

import java.util.List;

import by.coolbuy.model.User;

public interface UserDAO {
	
	void createUser(User user);

	User getUserById(int userId);
	
	User getUserByEmail(String email);

	List<User> getUsers();
	
	void deleteUser(User user);
	
	void updateUser(User user);

}
