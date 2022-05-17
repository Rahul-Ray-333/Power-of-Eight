package anonymousInnerClasses;

abstract class C {

	abstract public void m();

	public void m2() {
		System.out.println("from m2");
	}
}

public class AbstractClassInner {

	public static void main(String[] args) {
		C obj = new C() {

			@Override
			public void m() {
				System.out.println("From implementation of abstarct method using inner class");
			}

		};
		
		obj.m();
		obj.m2();
	}

}
