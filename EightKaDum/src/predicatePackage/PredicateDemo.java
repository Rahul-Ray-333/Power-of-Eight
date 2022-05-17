package predicatePackage;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {

		Predicate<Integer> p1 = i -> i > 10;

		System.out.println("Given Number is greater then 10 or not : " + p1.test(11));

		Predicate<String> p2 = s -> s.length() > 5;

		System.out.println("Given String lenght is greater then 5 or not : " + p2.test("Rahul RAy"));

		// Exmaple of using neagte() and() or()

		Predicate<Integer> p3 = i -> i % 2 == 0;

		System.out.println("Given Number is greater then 10  and even number check: " + p1.and(p3).test(12));
		
		System.out.println("Given Number is greater then 10 or even number check : " + p1.or(p3).test(1));
		
		System.out.println("Given Number is odd or not : " + p3.negate().test(12));
	}

}
