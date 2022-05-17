package biFunctionalInterfaces;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiExample {

	public static void main(String[] args) {

		BiPredicate<Integer, Integer> greater = (a, b) -> a > b;

		System.out.println("a is greater than b : " + greater.test(7, 3));

		BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;

		System.out.println("SUm of two numbers : " + sum.apply(45, 23));

		BiConsumer<String, Integer> show = (a, b) -> System.out.println("Name : " + a + " Roll No. : " + b);

		show.accept("Rahul Bhai", 333);

	}

}
