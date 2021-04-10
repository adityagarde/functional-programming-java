package com.aditya.functionalProgramming;

import java.util.function.BiFunction;

public class HigherOrderFunc1 {

	public static void main(String[] args) {
		BiFunction<Float, Float, Float> divide = (x, y) -> {
			if (y == 0F) {
				System.out.println("Error : Can't divide by zero.");
				return 0F;
			}

			return x / y;
		};
	}

}
