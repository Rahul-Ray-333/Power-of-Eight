package doubleColonMethodAndConstructorRefrence;

interface I {
	public void m1();
}

public class DemoOfMethodRef {

	public void m2() {
		System.out.println("Method Refrence EXAMPLE");
	}

	public static void main(String[] args) {

		DemoOfMethodRef obj = new DemoOfMethodRef();

		I i = obj::m2; // here m1 referring m2 methods using instance, if method is static than will
						// use Class name

		i.m1();

	}

}
