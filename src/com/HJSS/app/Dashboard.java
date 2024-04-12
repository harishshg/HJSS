package com.HJSS.app;

import com.HJSS.utils.Utils;
import com.HJSS.service.BookingService;

import java.util.List;

import com.HJSS.Model.*;

public class Dashboard {
	BookingService bookingService = new BookingService();

	public void start() {
		System.out.println("Welcome to The Hatfield Junior Swimming School Dashboard");
		System.out.println("Please choose");
		System.out.println("1. Book Solt/ Check Availability");
		System.out.println("2. Register as Student");
		System.out.println("3. Register as Instrucotr");
		System.out.println("4. Exit");
		System.out.println("please enter you choice: ");
		int choice = Utils.getChoice();

		switch (choice) {
		case 1:
			bookSlot();
			break;

		case 4:
			System.out.println("Exiting !!! Thank you visit again!!!");
			System.exit(0);
		default:
			System.out.println("invalid option please try again");
			start();
		}
	}

	public void bookSlot() {
		System.out.println("please choose");
		System.out.println("1. search by Day");
		System.out.println("2. Search by Grade");
		System.out.println("3. Search by Instructor");
		System.out.println("4. Go to Main Manu");
		System.out.println("5. Exit");
		System.out.println("please enter you choice: ");
		int choice = Utils.getChoice();

		switch (choice) {
		case 1:
			searchByDay();
			break;
		case 4:
			start();
		case 5:
			System.out.println("Exiting !!! Thank you visit again!!!");
			System.exit(0);
		default:
			System.out.println("invalid option please try again");
			bookSlot();
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
		System.out.println("8. Go Back to Search menu");
		System.out.println("9. Go to Main Manu");
		System.out.println("10. Exit");
		System.out.println("please enter you choice: ");
		int choice = Utils.getChoice();

		switch (choice) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
			List<Slot> slots = bookingService.getSlotsByDay(choice);
			if (slots.size() < 1) {
				System.out.println("Sorry Slots are ot available !, please try other day");
				searchByDay();
			}
			System.out.println("id \t\t Start Date \t\t Instructor Name \t\t status");
			slots.forEach(Slot::displaySolt);
			break;
		case 8:
			bookSlot();
		case 9:
			start();
		case 10:
			System.out.println("Exiting !!! Thank you visit again!!!");
			System.exit(0);
		default:
			System.out.println("invalid option please try again");
			searchByDay();
		}
	}
}