package consumerInterfaceEx;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<String> print = s -> System.out.println("NAME : " + s);
		print.accept("Rahul Ray");

		Consumer<String> showStatus = s -> System.out.println("STATUS : " + s);

		Consumer<String> resultConsumer = i -> System.out.println("Result : " + i);
		
		print.andThen(showStatus).andThen(resultConsumer).accept("HII");
	}

}
