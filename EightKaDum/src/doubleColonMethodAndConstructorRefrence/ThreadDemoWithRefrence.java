package doubleColonMethodAndConstructorRefrence;

class Threading {

	public void m1() {
		for (int i = 0; i < 10; i++) {
			System.out.println("method ref" + i);
		}
	}
}

public class ThreadDemoWithRefrence {

	public static void main(String[] args) {

		Threading obj = new Threading();
		Runnable r = obj::m1;
		Thread t = new Thread(r);

		t.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Method : " + i);
		}
	}

}
