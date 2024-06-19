package utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public abstract class ConvertDate {

	public static LocalDate convert(String date) {
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("MMMM dd yyyy", Locale.ENGLISH);
		LocalDate newDate = LocalDate.parse(date, format);
		
		return newDate;
	}
}
