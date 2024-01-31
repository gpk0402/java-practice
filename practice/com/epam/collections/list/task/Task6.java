package com.epam.collections.list.task;

import java.util.*;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employeeList = EmployeeList.getEmployeeList();
		HashMap<String, Integer> department_employee_count = new HashMap<>();
		for (Employee emp: employeeList) {
			if (department_employee_count.containsKey(emp.department)){
				int count = department_employee_count.get(emp.department)+1;
				department_employee_count.put(emp.department, count);
			}
			else {
				department_employee_count.put(emp.department, 1);
			}
		}
		System.out.println(department_employee_count);
	}

	
}
