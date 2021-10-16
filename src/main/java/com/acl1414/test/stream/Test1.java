package com.acl1414.test.stream;

import java.util.Arrays;
import java.util.List;

public class Test1 {
	
	public static void main(String[] args) {
		
		Test1 test = new Test1();
		test.init();
		
	}
	
	private void init() {
		
		List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

		
	     
		myList
		      .stream() // (1)  return a Stream
		      .filter(s -> s.startsWith("c")) // (2)  return a new Stream
		      .map(String::toUpperCase)  // (3)  return a new Stream
		      .sorted()   // (4)  return a new Stream
		      .forEach(System.out::println); // (5)
		
	}
	


}
