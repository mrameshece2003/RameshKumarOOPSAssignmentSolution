package com.oops.gradedassignment.departmentsolution;
//departmentName will return “ Hr Department “
//getTodaysWork will return  “ Fill today’s worksheet and mark your attendance”
//getWorkDeadline will return “ Complete by EOD “
//doActivity “team Lunch”

public class HrDepartment extends SuperDepartment {
	String departmentName() {
		return "Hr Department";
	}
	String getTodaysWork() {
		return "Fill today’s worksheet and mark your attendance";
	}
	String getWorkDeadline() {
		return "Complete by EOD";
	}
	String doActivity() {
		return "team Lunch";
	}
}
