package com.study.java.core.generics;

import java.util.Arrays;
import java.util.List;

public class UnboundedWildcard {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3);

		// Double list
		List<Double> list2 = Arrays.asList(1.1, 2.2, 3.3);
		
		List<String> list3 = Arrays.asList("Monitor","CPU","ROM");

		print(list1);

		print(list2);
		
		print(list3);
	}
	
	private static void print(List<?> list) {
		System.out.println(list);
	}

}
