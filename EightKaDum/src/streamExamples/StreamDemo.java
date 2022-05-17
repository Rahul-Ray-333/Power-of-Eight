package streamExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {

		ArrayList<Integer> l = new ArrayList<Integer>();

		l.add(2);
		l.add(13);
		l.add(4);
		l.add(52);
		l.add(6);
		l.add(7);
		l.add(8);
		System.out.println(l);
		// filter even numbers from list

		List<Integer> ol = l.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(ol);

		// multiply each element of list by 3

		List<Integer> ml = l.stream().map(i -> i * 3).collect(Collectors.toList());

		System.out.println(ml);

		// count of even numbers
		long l1 = l.stream().filter(i -> i % 2 == 0).count();
		System.out.println("count of even numbers : " + l1);

		// sort the given list in ascending order
		List<Integer> l2 = l.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted in ascending order: " + l2);

		// sort the given list in descending order

		List<Integer> l3 = l.stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());
		System.out.println("Sorted in ascending order: " + l3);

		Integer min = l.stream().min((a, b) -> a.compareTo(b)).get();
		System.out.println("Min Value : " + min);

		Integer max = l.stream().max((a, b) -> a.compareTo(b)).get();
		System.out.println("max value : " + max);

		l.stream().forEach(a -> System.out.println(a));

		Integer[] ary = l.stream().toArray(Integer[]::new);

		for (int i : ary) {
			System.out.println("ary : " + i);
		}

		Stream<Integer> st = Stream.of(13, 23, 12, 16, 111, 45, 89);

		List<Integer> i = st.sorted().toList();

		System.out.println(i);

		l.forEach(ele -> {
			System.out.println(ele);
		});
	}

}
