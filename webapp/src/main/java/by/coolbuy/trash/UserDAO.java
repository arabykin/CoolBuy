package by.coolbuy.trash;

import java.util.List;

public interface UserDAO {
	
	void createUser(User user);

	User getUserById(int userId);
	
	User getUserByEmail(String email);

	List<User> getUsers();
	
	void deleteUser(User user);
	
	void updateUser(User user);

}
