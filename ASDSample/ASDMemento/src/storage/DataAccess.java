package storage;

import application.User;

public interface DataAccess {
	public void saveData(User user);
	public User readUser(Integer id);

}
