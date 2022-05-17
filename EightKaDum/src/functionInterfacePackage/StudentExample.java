package functionInterfacePackage;

import java.util.ArrayList;
import java.util.function.Function;

class Student {

	String name;
	int marks;

	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
}

public class StudentExample {

	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<Student>();

		al.add(new Student("Rahul", 100));
		al.add(new Student("Ankita", 10));
		al.add(new Student("Priya", 67));
		al.add(new Student("Rohit", 39));

		Function<Student, String> getGrade = s -> {
			if (s.marks >= 80)
				return "A-Garde";
			else if (s.marks >= 60)
				return "B-Grade";
			else if (s.marks >= 50)
				return "C-Grade";
			else if (s.marks >= 35)
				return "D-Grade";
			else
				return "Failed";
		};

		for (Student s : al) {

			System.out.println("Name : " + s.name);
			System.out.println("Marks : " + s.marks);
			System.out.println("Garde : " + getGrade.apply(s));
		}
	}

}
