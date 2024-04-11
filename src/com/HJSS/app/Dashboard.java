package com.HJSS.app;

import com.HJSS.utils.Utils;

public class Dashboard {

	public void start() {
		System.out.println("Wlcome to The Hatfield Junior Swimming School Dashboard");
		System.out.println("Please choose");
		System.out.println("1. Book Solt/ Check Availability");
		System.out.println("2. Register as Student");
		System.out.println("3. Register as Instrucotr");
		System.out.println("please enter you choice: ");
		int choice= Utils.getChoice();
		
		switch(choice) {
		case 1:bookSlot();
				break;
				
		default: System.out.println("invalid option please try again");
		}
	}
	
	public void bookSlot() {
		System.out.println("please choose");
		System.out.println("1. search by Day");
		System.out.println("2. Search by Grade");
		System.out.println("3. Search by Instructor");
		System.out.println("please enter you choice: ");
		int choice= Utils.getChoice();
		
		switch(choice) {
		case 1:searchByDay();
				break;
				
		default: System.out.println("invalid option please try again");
		}
	}
	
	public void searchByDay() {
		System.out.println("please choose");
		System.out.println("1. Sunday");
		System.out.println("2. Monday");
		System.out.println("3. Tuesday");
		System.out.println("4. Wednesday");
		System.out.println("5. Thursday");
		System.out.println("6. Friday");
		System.out.println("7. Saturday");
		System.out.println("please enter you choice: ");
		int choice= Utils.getChoice();
		
		switch(choice) {
		case 1:searchByDay();
				break;
				
		default: System.out.println("invalid option please try again");
		}
	}
}
