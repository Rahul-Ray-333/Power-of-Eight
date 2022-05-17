package functionInterfacePackage;

import java.util.function.Function;

public class AndThenAndComposeExample {

	public static void main(String[] args) {

		Function<Integer, Integer> f1 = i -> i + i;

		Function<Integer, Integer> f2 = i -> i * i * i;

		System.out.println("andThen method Example : " + f1.andThen(f2).apply(2)); // f1 and then f2
		System.out.println("compose method Example : " + f1.compose(f2).apply(2)); // f2 and then f1

		Function<String, String> identity = Function.identity();

		System.out.println("Identity Example : " + identity.apply("Rahul"));
	}

}
