package com.oops.gradedassignment.departmentsolution;
//→ Driver class Main will be used to create objects of HrDepartment, TechDepartment, AdminDepartment
//→ Each department will display all its functionalities.
//→ Each department  will display whether today is a holiday or not with the help of the Super Department. (SuperDepartment will act as a super class for all the departments)

public class DriverClass {

	public static void main(String[] args) {
		AdminDepartment F1 = new AdminDepartment();
		AdminDepartment F2 = new AdminDepartment();
		AdminDepartment F3 = new AdminDepartment();
		AdminDepartment F4 = new AdminDepartment();
		
		HrDepartment F5 = new HrDepartment();
		HrDepartment F6 = new HrDepartment();
		HrDepartment F7 = new HrDepartment();
		HrDepartment F8 = new HrDepartment();
		HrDepartment F9 = new HrDepartment();
		
		TechDepartment F10 = new TechDepartment();
		TechDepartment F11 = new TechDepartment();
		TechDepartment F12 = new TechDepartment();
		TechDepartment F13 = new TechDepartment();
		TechDepartment F14 = new TechDepartment();
		
		System.out.println("welcome to "+ F1.departmentName());
		System.out.println(F2.getTodaysWork());
		System.out.println(F3.getWorkDeadline());
		System.out.println(F4.isTodayAHoliday());
		System.out.println("\n");
		System.out.println("welcome to " + F5.departmentName());
		System.out.println(F9.doActivity());
		System.out.println(F6.getTodaysWork());
		System.out.println(F7.getWorkDeadline());
		System.out.println(F8.isTodayAHoliday());
		System.out.println("\n");
		System.out.println("welcome to " + F10.departmentName());
		System.out.println(F11.getTodaysWork());
		System.out.println(F12.getWorkDeadline());
		System.out.println(F13.getTechStackInformation());
		System.out.println(F14.isTodayAHoliday());
		
		
		
		
		
		}
	

	}


