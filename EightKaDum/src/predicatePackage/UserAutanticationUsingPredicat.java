package predicatePackage;

import java.util.Scanner;
import java.util.function.Predicate;

class User {

	String name;
	String password;

	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

}

public class UserAutanticationUsingPredicat {

	public static void main(String[] args) {
		Predicate<User> auth = u -> u.name.equals("rahul") && u.password.equals("ray");

		Scanner sc = new Scanner(System.in);

		String name = sc.next();
		String pass = sc.next();

		if (auth.test(new User(name, pass)))
			System.out.println("valid user");
		else
			System.out.println("invalid");

		sc.close();
	}

}
