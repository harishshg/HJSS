package com.HJSS.Model;

import java.util.Date;

public class Slot {

	private int id;
	private Date startTime;
	public Slot(int id, Date startTime, Date endTime, Instructor instructor, Student student) {
		super();
		this.id = id;
		this.startTime = startTime;
		this.endTime = endTime;
		this.instructor = instructor;
		this.student = student;
	}
	private Date endTime;
	private Instructor instructor;
	private Student student;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Instructor getInstructor() {
		return instructor;
	}
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public void displaySolt() {
		System.out.println(this.id+" "+this.getStartTime().toLocaleString()+" "+this.getInstructor().getName());
	}
	
	
}
