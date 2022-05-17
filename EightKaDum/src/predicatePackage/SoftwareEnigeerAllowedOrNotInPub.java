package predicatePackage;

import java.util.ArrayList;
import java.util.function.Predicate;

class SoftwareEnigeer {
	String name;
	int age;
	boolean havingGF;

	public SoftwareEnigeer(String name, int age, boolean havingGF) {
		super();
		this.name = name;
		this.age = age;
		this.havingGF = havingGF;
	}

	@Override
	public String toString() {
		return "SoftwareEnigeer [name=" + name + ", age=" + age + ", havingGF=" + havingGF + "]";
	}

}

public class SoftwareEnigeerAllowedOrNotInPub {

	public static void main(String[] args) {
		Predicate<SoftwareEnigeer> allowed = se -> se.havingGF == true && se.age >= 18;

		ArrayList<SoftwareEnigeer> list = new ArrayList<SoftwareEnigeer>();

		list.add(new SoftwareEnigeer("Rahul", 24, true));
		list.add(new SoftwareEnigeer("Karan", 24, false));
		list.add(new SoftwareEnigeer("Rocky", 21, true));
		list.add(new SoftwareEnigeer("sahil", 17, true));
		list.add(new SoftwareEnigeer("monu", 24, false));

		for (SoftwareEnigeer se : list) {
			if (allowed.test(se))
				System.out.println("allowed  : " + se.toString());
			else
				System.out.println("Not Allowed : " + se.toString());
		}
	}

}
