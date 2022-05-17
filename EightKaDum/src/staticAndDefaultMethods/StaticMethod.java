package staticAndDefaultMethods;

interface Inter {

	public static void m() {
		System.out.println("I am here inside m of Interface static method");
	}
}

public class StaticMethod {

	public static void main(String[] args) {
		Inter.m(); // static method of an interface we can invoke only by its NAme itself
	}

}
