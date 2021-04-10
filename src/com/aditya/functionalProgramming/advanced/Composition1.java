package com.aditya.functionalProgramming.advanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Composition1 {
	protected static class Employee {
		public final String name;
		public final Integer age;
		public final String jobTitle;
		public final Float salary;

		public Employee(String name, Integer age, String jobTitle, Float salary) {
			this.name = name;
			this.age = age;
			this.jobTitle = jobTitle;
			this.salary = salary;
		}
	}

	public static void main(String[] args) {
		
        Function<Integer, Integer> timesTwo = x -> x * 2;
        Function<Integer, Integer> minusOne = x -> x - 1;

		Function<Integer, Integer> minusOneAndDouble = minusOne.andThen(timesTwo);

		System.out.println(minusOneAndDouble.apply(10));

		Function<Integer, Integer> doubleAndMinusOne = minusOne.compose(timesTwo);

		System.out.println(doubleAndMinusOne.apply(10));

        Employee[] employeesArr = {
                new Employee("John", 34, "developer", 80000f),
                new Employee("Hannah", 24, "developer", 95000f),
                new Employee("Bart", 50, "sales executive", 100000f),
                new Employee("Sophie", 49, "construction worker", 40000f),
                new Employee("Darren", 38, "writer", 50000f),
                new Employee("Nancy", 29, "developer", 75000f),
		};
		List<Employee> employees = new ArrayList<>(Arrays.asList(employeesArr));

		Function<Employee, String> getName = x -> x.name;
		Function<String, String> reverse = x -> new StringBuilder(x).reverse().toString();
		Function<String, String> upperCase = x -> x.toUpperCase();

		Function<Employee, String> getReveredUppercasedNmaes = getName.andThen(reverse).andThen(upperCase);
		
		List<String> results = employees.stream()
										.map(getReveredUppercasedNmaes)
										.collect(Collectors.toList());
		
		System.out.println(results);
	}
}
