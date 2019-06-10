package com.study.java.core.generics;

public class GenericInheritance {

	public static void main(String[] args) {
		
		String str = "abc";
		Object obj = new Object();
		obj=str;
		System.out.println(">>>> 1 :"+obj);
		TClass<String> class1 = new TClass<String>();
		TClass<Object> class2 = new TClass<Object>();
		
		obj = class1;
		System.out.println(">>>> 2 :"+obj);		
	}
	
	public static class TClass<T>{
		
	}

}
