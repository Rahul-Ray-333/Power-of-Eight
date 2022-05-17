package supplierInterface;

import java.util.function.Supplier;

public class OtpGeneration {

	public static void main(String[] args) {

		Supplier<String> otp = () -> {

			String buildOtp = "";

			for (int i = 0; i < 6; i++) {
				buildOtp = buildOtp + ((int) (Math.random() * 10));
			}
			return buildOtp;
		};

		System.out.println(otp.get());
		System.out.println(otp.get());
		System.out.println(otp.get());
		System.out.println(otp.get());
		System.out.println(otp.get());
		System.out.println(otp.get());
	}

}
