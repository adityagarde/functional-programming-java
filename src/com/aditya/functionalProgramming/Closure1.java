package com.aditya.functionalProgramming;

import com.aditya.functionalProgramming.function.NoArgFunction;

public class Closure1 {

	public static void main(String[] args) {
		NoArgFunction<NoArgFunction<String>> createPrinter = () -> {
			String name = "Aditya";
			return () -> "Hello, " + name + "!";
		};

		NoArgFunction<String> printer = createPrinter.apply();
		System.out.println(printer.apply());
		// System.out.println(name);
	}

}
