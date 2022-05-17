package anonymousInnerClasses;

interface Inter {

	public void m();
}

public class ReplaceInnerClassWithLambdaForFunctionalInter {

	public static void main(String[] args) {

		Inter obj = () -> System.out.println("From M");
		obj.m();
	}

}
