package com.java.training;

import java.util.LinkedList;

public class EmployeeLinkedList {
	private static final Employee[] v = null;

	public static void main(String[] args) {
		LinkedList<Employee> v = addInput();
		display(v);
	}

	private static LinkedList<Employee> addInput() {
		Employee e1 = new Employee(101, "Vini", "US");
		Employee e2 = new Employee(102, "Lokesh", "Uk");
		Employee e3 = new Employee(103, "Shiv", "London");
		LinkedList<Employee> v = new LinkedList<Employee>();
		v.add(e1);
		v.add(e2);
		v.add(e3);
		return v;
	}

	private static void display(LinkedList<Employee> v) {
		for (Employee e : v) {
			System.out.println(e.getEmpid() + "\t" + e.getEname() + "\t" + e.getAddress());
		}
	}

}
