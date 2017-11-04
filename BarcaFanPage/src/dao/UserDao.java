package dao;

import java.util.ArrayList;
import java.util.List;


import Entity.User;

public class UserDao {
	private static List<User> database;

	public static void addUserToDatabase(User user) {
		if (database == null) {
			database = new ArrayList<>();
			database.add(user);
		}else {
			database.add(user);
		}
	}

	
	public static String allUsers() {
		if (database == null) {
			return "Not found...";
		}
		return database.toString();
	}
}
