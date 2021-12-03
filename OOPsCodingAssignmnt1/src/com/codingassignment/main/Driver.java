package com.codingassignment.main;

import com.codingassignment.service.AdminDepartment;
import com.codingassignment.service.HR_Department;
import com.codingassignment.service.TechDepartment;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating the objects of the 3 classes below:
		
		AdminDepartment admindept =new AdminDepartment();
		HR_Department hrdept =new HR_Department();
		TechDepartment techdept =new TechDepartment();
		
		//Printing the desired output:
		
		System.out.println("Welcome to Admin Department");
		System.out.println(admindept.getTodaysWork());
		System.out.println(admindept.getWorkDeadline());
		System.out.println(admindept.isTodayAHoliday());
		System.out.println();
		System.out.println("Welcome to HR Department");
		System.out.println(hrdept.doActivity());
		System.out.println(hrdept.getTodaysWork());
		System.out.println(hrdept.getWorkDeadline());
		System.out.println(hrdept.isTodayAHoliday());
		System.out.println();
		System.out.println("Welcome to Tech Department");
		System.out.println(techdept.getTodaysWork());
		System.out.println(techdept.getWorkDeadline());
		System.out.println(techdept.getTechStackInformation());
		System.out.println(techdept.isTodayAHoliday());

	}

}
