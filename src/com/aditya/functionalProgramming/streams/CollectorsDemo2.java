package com.aditya.functionalProgramming.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsDemo2 {

	public static void main(String[] args) {

		String[] strArray = { "Go", "here", "Puri", "Krishna", "Calf", "Tea", "Coffee" };
		List<String> strList = new ArrayList<String>(Arrays.asList(strArray));

		Map<Integer, List<String>> returnMap1 = strList.stream()
				.collect(Collectors.groupingBy(word -> word.length()));
		System.out.println(returnMap1);

		Map<Boolean, List<String>> returnMap2 = strList.stream()
				.collect(Collectors.partitioningBy(word -> word.length() > 3));
		System.out.println(returnMap2);

	}

}
