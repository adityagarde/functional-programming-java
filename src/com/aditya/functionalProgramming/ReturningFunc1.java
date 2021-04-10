package com.aditya.functionalProgramming;

import com.aditya.functionalProgramming.function.NoArgFunction;

public class ReturningFunc1 {

	public static void main(String[] args) {
		NoArgFunction<NoArgFunction<String>> createPrinter1 = () -> {
			return () -> "Hello Function 1";
		};

		NoArgFunction<String> printer1 = createPrinter1.apply();

		NoArgFunction<NoArgFunction<String>> createPrinter2 = () -> () -> "Hello Function 2";

		NoArgFunction<String> printer2 = createPrinter2.apply();

		System.out.println(printer1.apply());

		System.out.println(printer2.apply());

	}

}
