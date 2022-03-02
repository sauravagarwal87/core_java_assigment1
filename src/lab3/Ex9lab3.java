package lab3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Ex9lab3 {

	public static void main(String[] args) {
		DateTimeFormatter dft = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate.format(dft));
	}
	
}
