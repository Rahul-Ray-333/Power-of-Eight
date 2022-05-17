import java.util.ArrayList;
import java.util.Collections;

@FunctionalInterface
interface Intrf {

	public int getStringLenght(String s);
}

@FunctionalInterface
interface I2 {
	public int getMulti(int a, int b);
}

class Employee {

	int eno;
	String ename;

	public Employee(int eno, String ename) {
		super();
		this.eno = eno;
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + "]";
	}

}

public class FirstClass {

	public static void main(String[] args) {

		Intrf i = s -> s.length();

		System.out.println(i.getStringLenght("Rahul"));
		System.out.println(i.getStringLenght("Priyaaaaa"));
		System.out.println(i.getStringLenght("Riya"));

		I2 i2 = (a, b) -> a * b;

		System.out.println(i2.getMulti(2, 34));

		// List Example

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(23);
		list.add(32);
		list.add(0);
		list.add(3);
		list.add(-2);
		list.add(55);

		Collections.sort(list, ((a, b) -> ((a > b) ? -1 : (a < b) ? 1 : 0)));

		System.out.println("List In decending Order : " + list);

		Collections.sort(list, ((Integer a, Integer b) -> ((a > b) ? 1 : (a < b) ? -1 : 0)));

		System.out.println("List In acending Order : " + list);

		// List of Employee

		ArrayList<Employee> eList = new ArrayList<Employee>();

		eList.add(new Employee(20, "Rahul"));
		eList.add(new Employee(0, "Riya"));
		eList.add(new Employee(10, "Sunny"));
		eList.add(new Employee(40, "Bunny"));
		eList.add(new Employee(30, "Motu"));
		eList.add(new Employee(50, "Chhotu"));

		System.out.println(eList);

		Collections.sort(eList, (e1, e2) -> (e1.eno < e2.eno ? -1 : e1.eno > e2.eno ? 1 : 0));
		
		System.out.println(eList);
	}
}
