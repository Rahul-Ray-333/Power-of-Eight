package anonymousInnerClasses;

interface I {
	public void m1();

	public void m2();

	public void m3();
}

public class InnerAnonymousWithInterface {

	public static void main(String[] args) {

		I obj = new I() {

			@Override
			public void m3() {
				System.out.println("From m3");
			}

			@Override
			public void m2() {
				System.out.println("From m2");
			}

			@Override
			public void m1() {
				System.out.println("From m1");

			}
		};
		
		obj.m1();
		obj.m2();
		obj.m3();
	}

}
