package dateAndTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.Year;

public class DateAndTimeDemo {

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		System.out.println("Day : " + localDate.getDayOfMonth());
		System.out.println("Month : " + localDate.getMonthValue());
		System.out.println("Year : " + localDate.getYear());

		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		System.out.println("H : " + localTime.getHour());
		System.out.println("M : " + localTime.getMinute());
		System.out.println("S : " + localTime.getSecond());
		System.out.println("N : " + localTime.getNano());

		LocalDateTime dt = LocalDateTime.now();

		System.out.printf("Day : %d\n", dt.getDayOfMonth());

		System.out.println("Month : " + dt.getMonthValue());
		System.out.println("Year : " + dt.getYear());
		System.out.println("H : " + dt.getHour());
		System.out.println("M : " + dt.getMinute());
		System.out.println("S : " + dt.getSecond());
		System.out.println("N : " + dt.getNano());

		System.out.println("Before six months : " + dt.minusMonths(6));
		System.out.println("After six months : " + dt.plusMonths(6));

		LocalDate bd = LocalDate.of(1998, 01, 21);
		LocalDate today = LocalDate.now();
		Period p = Period.between(bd, today);
		
		System.out.println(p.getYears());
		System.out.println(p.getMonths());
		System.out.println(p.getDays());

		Year y = Year.now();
	}

}
