package com.aditya.functionalProgramming.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingList {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Paul", "Jane", "Michaela", "Sam");
		// way to sort prior to Java 8 lambdas
		Collections.sort(names, new Comparator<String>() {
			public int compare(String a, String b) {
				return b.compareTo(a);
			}
		});

		System.out.println(names);

		Collections.sort(names, (a, b) -> b.compareTo(a));

		System.out.println(names);
	}

}
