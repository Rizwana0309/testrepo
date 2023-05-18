package com.springboot.test.proj.entities;

public class familydfbirth
{
	
	private int date;
	private String month;
	private int year;
	private long ID;
	
	public familydfbirth(int date, String month, int year, long iD) 
	{
		super();
		this.date = date;
		this.month = month;
		this.year = year;
		this.ID = ID;
	}

	public familydfbirth(int i, String string, int j) 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public long getID() {
		return ID;
	}

	public void setID(long ID) {
		ID = ID;
	}
	
}