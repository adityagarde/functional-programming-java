package com.aditya.functionalProgramming;

import java.util.function.BiFunction;
import java.util.function.Function;

public class HigherOrderFunc2 {

	public static void main(String[] args) {
		BiFunction<Float, Float, Float> divide = (x, y) -> x / y;

		Function<BiFunction<Float, Float, Float>, BiFunction<Float, Float, Float>> validateDenominator = 
				(func) -> (x, y) -> {
					if (y == 0F) {
						System.out.println("Error : Can't divide by zero.");
						return 0F;
					}

					return func.apply(x, y);
				};

		BiFunction<Float, Float, Float> divideSafe = validateDenominator.apply(divide);

		System.out.println(divideSafe.apply(10F, 2F));
	}

}