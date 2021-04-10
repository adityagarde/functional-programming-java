package com.aditya.functionalProgramming.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapDemo {

	public static void main(String[] args) {
		Integer[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		List<Integer> intList = new ArrayList<Integer>(Arrays.asList(intArray));

		List<Integer> intListDoubled1 = new ArrayList<Integer>();
		for (int i = 0; i < intList.size(); i++) {
			int result = intList.get(i) * 2;
			intListDoubled1.add(result);
		}

		System.out.println(intListDoubled1);

		Function<Integer, Integer> timesTwo = x -> x * 2;

		List<Integer> intListDoubled2 = intList.stream().map(timesTwo).collect(Collectors.toList());

		System.out.println(intListDoubled2);
	}

}
