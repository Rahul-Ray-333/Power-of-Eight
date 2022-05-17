package functionInterfacePackage;

import java.util.function.Function;

public class StartWithFunctionInter {

	public static void main(String[] args) {

		Function<String, Integer> f = s -> s.length(); // here T is input value to apply function and R is return type

		System.out.println("Lenght of String RahulRay is : " + f.apply("RahulRay"));
		System.out.println("Lenght of String AnkitaPagal is : " + f.apply("AnkitaPagal"));

		// function to remove spaces from string

		Function<String, String> removeSpace = s -> s.replaceAll(" ", "");

		System.out.println("String without space is : "
				+ removeSpace.apply("Rahul is a very good boy, he take cares of everyone"));

		// function for count spaces in sentence
		Function<String, Integer> countSpace = s -> s.length() - s.replaceAll(" ", "").length();
		
		System.out.println("count of spaces is : "
				+ countSpace.apply("Rahul is a very good boy, he take cares of everyone"));

		
	}

}
