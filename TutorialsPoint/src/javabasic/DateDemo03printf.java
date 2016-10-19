package javabasic;

import java.util.Date;

public class DateDemo03printf {
	public static void main(String args[]) {
		// Instantiate a Date object
		Date date = new Date();

		// display time and date using toString()
		String str = String.format("Current Date/Time : %tc", date );

		System.out.printf(str);
	}
}
