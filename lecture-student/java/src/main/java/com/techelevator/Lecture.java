package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;

public class Lecture {

	public static void main(String[] args) {

		NumbericFns<Integer> iOb = new NumbericFns<>(4);
		NumbericFns<Double> dOb = new NumbericFns<>(-4.0);
		System.out.println(iOb.absEqual(dOb));
//		System.out.println(iOb.square());
//		MyClass<Integer, String> obj = new MyClass<>(10, "Hello");
//		MyClass<Double, Integer> obj2 = new MyClass<>(20.0, 2);
//
//
//		obj.showType();
//		obj2.showType();

	}

}
