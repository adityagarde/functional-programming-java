package com.aditya.functionalProgramming;

import java.util.function.BiFunction;

import com.aditya.functionalProgramming.function.NoArgFunction;
import com.aditya.functionalProgramming.function.TriFunction;

public class BiFunc1 {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> myAdd = (x, y) -> (x + y);
		System.out.println(myAdd.apply(5, 13));

		TriFunction<Integer, Integer, Integer, Integer> myAdd2 = (x, y, z) -> (x + y + z);
		System.out.println(myAdd2.apply(5, 13, 4));

		NoArgFunction<String> hello = () -> "Hello";
		System.out.println(hello.apply());
	}

}