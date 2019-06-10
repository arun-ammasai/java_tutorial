package com.study.java.core.generics;

public class GenericsType<T> {

	private T t;

	public T get() {
		return this.t;
	}

	public void set(T t1) {
		this.t = t1;
	}

	@SuppressWarnings("unchecked")
	public static void main(String args[]) {
		GenericsType<String> type = new GenericsType<>();
		type.set("Pankaj"); // valid

		@SuppressWarnings("rawtypes")
		GenericsType type1 = new GenericsType(); // raw type
		type1.set("Pankaj"); 
		type1.set(10); 

		System.out.println("GT :" + type.get());
		System.out.println("GT1 :" + type1.get());
	}
}