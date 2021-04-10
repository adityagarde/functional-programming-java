package com.aditya.functionalProgramming.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterDemo3 {

	public static void main(String[] args) {

		String[] strArray = { "Go", "Again", "Puri", "Krishna", "Calf", "Tea" };
		List<String> strList = new ArrayList<String>(Arrays.asList(strArray));

		Function<Integer, Predicate<String>> numberPredicate1 = (reqrdLength) -> {
			return str -> str.length() > reqrdLength;
		};
		
		List<String> newStrList1 = strList.stream()
										  .filter(numberPredicate1.apply(2))
										  .collect(Collectors.toList());

		System.out.println(newStrList1);

		Function<Integer, Predicate<String>> numberPredicate2 = (reqrdLength) -> str -> str.length() > reqrdLength;

		List<String> newStrList2 = strList.stream()
										   .filter(numberPredicate2.apply(3))
										   .collect(Collectors.toList());

		System.out.println(newStrList2);

	}

}
