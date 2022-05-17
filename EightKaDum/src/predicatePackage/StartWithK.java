package predicatePackage;

import java.util.ArrayList;
import java.util.function.Predicate;

public class StartWithK {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();

		al.add("kajal");
		al.add("sunny");
		al.add("bunny");
		al.add("katrina");
		al.add("");
		al.add("kukuuu");

		Predicate<String> isEmpty = s -> s.isEmpty();

		Predicate<String> startWithK = s -> s.charAt(0) == 'k';

		for (String s : al) {
			if (isEmpty.negate().and(startWithK).test(s))
				System.out.println(s);
		}

		// remove null and empty values using predicates

		ArrayList<String> validList = new ArrayList<String>();

		al.add(null);

		Predicate<String> removeNullAndEmpty = s -> s != null && !s.isEmpty();

		System.out.println(al);

		for (String s : al) {
			if (removeNullAndEmpty.test(s))
				validList.add(s);
		}

		System.out.println("After removing null and empty strings : " + validList);
	}

}
