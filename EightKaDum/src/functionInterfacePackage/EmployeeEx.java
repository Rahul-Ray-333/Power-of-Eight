package functionInterfacePackage;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {

	String name;
	double salary;

	public Employee(String name, double salary) {

		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

}

public class EmployeeEx {

	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();

		al.add(new Employee("Rahul", 3330000));
		al.add(new Employee("Ankita", 4330000));
		al.add(new Employee("Kuttuuu", 20000));
		al.add(new Employee("nikku", 10000));

		Function<ArrayList<Employee>, Double> totalSalary = emp -> {
			double total = 0;
			for (Employee e : emp) {
				total = total + e.salary;
			}
			return total;
		};
		System.out.println("total salary of all Employees : " + totalSalary.apply(al));

		Predicate<Employee> p = e -> e.salary > 10000;

		Function<ArrayList<Employee>, ArrayList<Employee>> increamentSalary = empSalary -> {
			for (Employee e : empSalary) {
				if(p.test(e))
				   e.salary = e.salary + 33;
			}
			return empSalary;
		};
		
		System.out.println("After Increament salary : " + increamentSalary.apply(al));
	}

}
