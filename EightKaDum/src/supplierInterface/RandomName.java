package supplierInterface;

import java.util.function.Supplier;

public class RandomName {

	public static void main(String[] args) {

		String[] ary = { "Rahul", "RIYA", "Priya", "ANKITA", "SUPRIYA" };

		Supplier<String> s = () -> ary[(int) (Math.random() * 5)];

		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());

	}

}
