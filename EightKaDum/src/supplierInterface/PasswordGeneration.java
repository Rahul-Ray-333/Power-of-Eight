package supplierInterface;

import java.util.function.Supplier;

public class PasswordGeneration {

	public static void main(String[] args) {

		Supplier<String> password = () -> {

			String pwd = "";
			Supplier<Integer> digit = () -> (int) (Math.random() * 10);

			String symbChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$&";

			Supplier<Character> chr = () -> symbChar.charAt((int) (Math.random() * 30));

			for (int i = 1; i <= 8; i++) {
				if (i % 2 == 0)
					pwd = pwd + digit.get();
				else
					pwd = pwd + chr.get();
			}

			return pwd;
		};
		
		System.out.println(password.get());
		System.out.println(password.get());
		System.out.println(password.get());
		System.out.println(password.get());
		System.out.println(password.get());
		System.out.println(password.get());
	}

}
