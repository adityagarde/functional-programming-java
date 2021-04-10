package com.aditya.functionalProgramming.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsDemo1 {
	
	public static void main(String[] args) {

		String[] strArray = { "Go", "here", "Puri", "Krishna", "Calf", "Tea" };
		List<String> strList = new ArrayList<String>(Arrays.asList(strArray));

		List<String> newStrList = strList.stream()
										 .filter(x -> x.length() > 3)
										 .collect(Collectors.toList());
		System.out.println(newStrList);

		Set<String> newStrSet = strList.stream()
				 					   .filter(x -> x.length() > 3)
				 					   .collect(Collectors.toSet());
		System.out.println(newStrSet);
		
		String newStr1 = strList.stream()
							   	.filter(x -> x.length() > 3)
							   	.collect(Collectors.joining("~"));

		System.out.println(newStr1);

		Long newCount = strList.stream()
							   .filter(x -> x.length() > 3)
							   .collect(Collectors.counting());

		System.out.println(newCount);
	}

}
