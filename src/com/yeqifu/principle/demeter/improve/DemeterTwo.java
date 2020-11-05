package com.yeqifu.principle.demeter.improve;

import java.util.ArrayList;
import java.util.List;


public class DemeterTwo {
	public static void main(String[] args) {
		SchoolManager schoolManager = new SchoolManager();
		schoolManager.printAllEmployee(new CollegeManager());
	}
}
//学校总部员工
class Employee {
	private Integer id;

	public Employee(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}

//学院员工
class CollegeEmployee {
	private Integer id;

	public CollegeEmployee(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}

//学院管理类
class CollegeManager {
	public List<CollegeEmployee> getAllEmployee() {
		List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
		for (int i = 0; i < 5; i++) {
			list.add(new CollegeEmployee(i));
		}
		return list;
	}
	public void printAllEmployee(){
		List<CollegeEmployee> list = this.getAllEmployee();
		System.out.println("===============学院员工================");
		for (CollegeEmployee collegeEmployee : list) {
			System.out.println("学院员工：" + collegeEmployee.getId());
		}
	}
}

//学校管理类
//SchoolManager的直接朋友类有Employee、CollegeManager
class SchoolManager {
	public List<Employee> getAllEmployee() {
		List<Employee> list = new ArrayList<Employee>();
		for (int i = 0; i < 10; i++) {
			list.add(new Employee(i));
		}
		return list;
	}

	void printAllEmployee(CollegeManager sub) {
		sub.printAllEmployee();
		List<Employee> list2 = this.getAllEmployee();
		System.out.println("===============学校员工=================");
		for (Employee employee : list2) {
			System.out.println("学校员工：" + employee.getId());
		}
	}
}
