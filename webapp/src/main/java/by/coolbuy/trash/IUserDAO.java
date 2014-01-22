package by.coolbuy.trash;

import java.util.List;

public interface IUserDAO {

	void insertUser(User user);

	User getUserById(int userId);

	User getUser(String username);

	List<User> getUsers();
}
