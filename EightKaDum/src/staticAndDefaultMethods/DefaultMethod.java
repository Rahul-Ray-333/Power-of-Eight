package staticAndDefaultMethods;

interface I {

	default public void m() {

		System.out.println("Oh dear !! I am here inside m");
	}

}

public class DefaultMethod {

	public static void main(String[] args) {
		I obj = new I() {
		};

		obj.m(); // for calling default methods of interface we always required implementation
					// class obj
	}

}
