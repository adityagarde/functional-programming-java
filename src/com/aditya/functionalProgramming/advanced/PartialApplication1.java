package com.aditya.functionalProgramming.advanced;

import java.util.function.BiFunction;
import java.util.function.Function;

import com.aditya.functionalProgramming.function.TriFunction;

public class PartialApplication1 {

	public static void main(String[] args) {

		TriFunction<Integer, Integer, Integer, Integer> add = (x, y, z) -> x + y + z;

		Function<Integer, BiFunction<Integer, Integer, Integer>> addSome = x -> (y, z) -> add.apply(x, y, z);

		BiFunction<Integer, Integer, Integer> add5 = addSome.apply(5);

		System.out.println(add5.apply(6, 7));
	}

}
