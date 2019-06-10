package com.study.java.core.generics;

import java.util.Arrays;
import java.util.List;

public class LowerBoundWildCardExample {
	public static void main(String a[]) {
		//Lower Bounded Integer List 
        List<Integer> list1= Arrays.asList(4,5,6,7); 
          
        //Integer list object is being passed 
        print(list1); 
  
        //Number list 
        List<Number> list2= Arrays.asList(4,5,6,7); 
          
        //Integer list object is being passed 
        print(list2);
        
	}
	
	private static void print(List<? super Integer> list) {
		list.add(new Integer(50));
		System.out.println(list);
	}
}
