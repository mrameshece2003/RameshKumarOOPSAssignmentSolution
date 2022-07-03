package com.oops.gradedassignment.departmentsolution;
//departmentName will return “ Admin Department “
//getTodaysWork will return “Complete your documents Submission”
//etWorkDeadline will return “ Complete by EOD “

public class AdminDepartment extends SuperDepartment {
	 String departmentName() {
		return "Admin Department";
		}
	String getTodaysWork() {
		return "Complete your documents Submission";
	}
	String getWorkDeadline() {
		return "Complete by EOD";
	}

    }

