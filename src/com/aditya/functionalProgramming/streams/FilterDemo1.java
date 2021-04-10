package com.aditya.functionalProgramming.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterDemo1 {

	public static void main(String[] args) {
		Integer[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 10 };
		List<Integer> intList = new ArrayList<Integer>(Arrays.asList(intArray));

		List<Integer> evenList1 = new ArrayList<Integer>();
		for (int i = 0; i < intList.size(); i++) {
			if (intList.get(i) % 2 == 0) {
				evenList1.add(intList.get(i));
			}
		}
		System.out.println(evenList1);

		Predicate<Integer> isEven = x -> x % 2 == 0;
		List<Integer> evenList2 = intList.stream().filter(isEven).collect(Collectors.toList());

		System.out.println(evenList2);

		List<Integer> evenList3 = intList.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());

		System.out.println(evenList3);

	}

}
