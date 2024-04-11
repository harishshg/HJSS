package com.HJSS.utils;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Utils {

	static Scanner scanner= new Scanner(System.in);
	public static int getChoice() {
		return scanner.nextInt();
	}
	
	public static Date getDate(int year, int month, int day, int hour, int min ) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(year,month, day, hour,min);
		return calendar.getTime();
	}
	
}
