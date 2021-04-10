package com.aditya.functionalProgramming.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreams {

	public static void main(String[] args) {

		String[] strArray = { "Go", "here", "Puri", "Krishna", "Calf", "Tea" };
		List<String> strList = new ArrayList<String>(Arrays.asList(strArray));
		
		List<String> updateStrList = strList.parallelStream()
											.map(x -> {
												System.out.println("Uppercasing " + x);
												return x.toUpperCase();
											})
											.map(x -> {
												System.out.println("Adding ~ " + x);
												return x + "~";										
											})
											.collect(Collectors.toList());
		System.out.println(updateStrList);

	}

}
