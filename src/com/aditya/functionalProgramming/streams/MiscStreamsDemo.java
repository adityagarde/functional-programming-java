package com.aditya.functionalProgramming.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MiscStreamsDemo {
	
	public static void main(String[] args) {
		
		Arrays.asList("red", "green", "blue")
        .stream()
        .sorted()
        .findFirst()
        .ifPresent(System.out::println);
		
		List<String> fruitList = Arrays.asList("apple", "pear", "banana", "cherry", "apricot");
		
		List<String> fruitListA1 = fruitList.stream()
											.map(x -> x.startsWith("a") ? x : null)
											.collect(Collectors.toList());
		System.out.println(fruitListA1);
		
		List<String> fruitListA2 = fruitList.stream()
											.filter(x -> x.startsWith("a"))
											.collect(Collectors.toList());
		
		System.out.println(fruitListA2);
		
		fruitList.stream()
				 .filter(x -> x.startsWith("a"))
				 .forEach(x -> System.out.println(x));
		
		// the list is traversed once only - forEach will be executed in the first traversal.
		Stream.of("apple", "pear", "banana", "cherry", "apricot")
        .filter(fruit -> {
          System.out.println("filter: " + fruit);
            return fruit.startsWith("a"); //predicate
        })
        .forEach(fruit -> System.out.println("Starts with A: " + fruit));
	}

}
