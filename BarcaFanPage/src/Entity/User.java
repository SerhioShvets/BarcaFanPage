package Entity;

public class User {
	private static String name;
	private static String email;
	private static String password;

	public User(String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.password = password;
	}

	@Override
	public String toString() {
		return "{name: " + name + "; email: "+ email + "}";
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		User.name = name;
	}

	public static String getEmail() {
		return email;
	}

	public static void setEmail(String email) {
		User.email = email;
	}

	public static String getPassword() {
		return password;
	}

	public static void setPassword(String password) {
		User.password = password;
	}
}
