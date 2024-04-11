package com.HJSS.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.HJSS.Model.Instructor;
import com.HJSS.Model.Slot;
import com.HJSS.Model.Student;
import com.HJSS.utils.Utils;

public class BookingService {

	List<Slot> slots= new ArrayList<Slot>();
	public BookingService(){
		slots.add(new Slot(1,Utils.getDate(2024,3,11,9,15),Utils.getDate(2024,4,11,9,45),new Instructor(1,"john"),new Student(1,"harry")));
		slots.add(new Slot(2,Utils.getDate(2024,3,10,9,15),Utils.getDate(2024,4,11,9,45),new Instructor(2,"doe"),new Student(2,"ram")));
		slots.add(new Slot(3,Utils.getDate(2024,3,9,9,15),Utils.getDate(2024,4,11,9,45),new Instructor(3,"mark"),new Student(3,"jake")));
		slots.add(new Slot(4,Utils.getDate(2024,3,10,9,15),Utils.getDate(2024,4,11,9,45),new Instructor(2,"doe"),null));
		slots.add(new Slot(5,Utils.getDate(2024,3,9,9,15),Utils.getDate(2024,4,11,9,45),new Instructor(3,"mark"),null));
	}
	public List<Slot> getSlotsByDay(int choice){
		
		return slots.stream().filter(s->s.getStartTime().getDay() == choice-1).toList();
		
	}
}
