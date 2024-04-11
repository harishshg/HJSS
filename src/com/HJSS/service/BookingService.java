package com.HJSS.service;

import java.util.ArrayList;
import java.util.List;

import com.HJSS.Model.Slot;

public class BookingService {

	List<Slot> slots= new ArrayList<Slot>();
	public BookingService(){
		slots.add(new Slot());
	}
	public List<Slot> getSlotsByDay(int choice){
		
		
		return slots;
		
	}
}
