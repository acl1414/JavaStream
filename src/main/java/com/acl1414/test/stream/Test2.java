package com.acl1414.test.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2 {
	
	public static void main(String[] args) {
		
		Test2 test = new Test2();
		test.init();
		
	}
	
	private void init() {
		
		List<Employee> myList = new ArrayList<Employee>();
		myList.add(new Employee("alain",2800f,"M"));
		myList.add(new Employee("marjo",1800f,"F"));
		myList.add(new Employee("ethan",200f,"M"));
		myList.add(new Employee("hugo",30f,"M"));
		
	     
		myList
		      .stream() // (1)  return a Stream
		      .filter(emp -> emp.getSalary() > 1000f) // (2)  return a new Stream
		  	  .sorted()   // (4)  return a new Stream
		      .forEach(System.out::println); // (5)
		
	}
	


}
