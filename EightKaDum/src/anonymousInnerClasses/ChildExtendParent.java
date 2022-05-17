package anonymousInnerClasses;

class P {

	int x = 333;

	public void m1() {
		System.out.println("from P : " + this.x);
	}
}

public class ChildExtendParent {
	static int x = 999;
	public static void main(String[] args) {

		
		P obj = new P() {

			int x = 000;

			public void m1() {
				System.out.println("From inner c : " + this.x);
			}
		};

		obj.m1();
        System.out.println(ChildExtendParent.x);
	}

}
