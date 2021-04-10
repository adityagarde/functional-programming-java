package com.aditya.functionalProgramming.advanced;

import java.util.function.BiFunction;
import java.util.function.Function;

import com.aditya.functionalProgramming.function.TriFunction;

public class PartialApplication2 {

	public static void main(String[] args) {
		TriFunction<Integer, Integer, Integer, Integer> add = (x, y, z) -> x + y + z;

		BiFunction<Integer, Integer, Function<Integer, Integer>> addPartial = 
				(x, y) -> z -> add.apply(x, y, z);

		Function<Integer, Integer> add5and6 = addPartial.apply(5, 6);

		System.out.println(add5and6.apply(7));
	}

}
