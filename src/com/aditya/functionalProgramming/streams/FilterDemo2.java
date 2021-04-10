package com.aditya.functionalProgramming.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {

	public static void main(String[] args) {

		String[] strArray = { "Go", "here", "Puri", "Krishna", "Calf", "Tea" };
		List<String> strList = new ArrayList<String>(Arrays.asList(strArray));

		List<String> newStrList = strList.stream()
										 .filter(x -> x.length() > 3)
										 .collect(Collectors.toList());
		System.out.println(newStrList);
	}

}
