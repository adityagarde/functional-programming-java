package com.aditya.functionalProgramming.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ReduceDemo1 {

	public static void main(String[] args) {

		Integer[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		List<Integer> intList = new ArrayList<Integer>(Arrays.asList(intArray));

		BinaryOperator<Integer> sumOperator = (acc, x) -> {
			Integer result = acc + x;
			System.out.println("acc = " + acc + " x = " + x + " result = " + result);
			return result;
		};

		Integer sum = intList.stream().reduce(0, sumOperator);

		System.out.println(sum);
	}

}
