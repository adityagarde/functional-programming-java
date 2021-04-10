package com.aditya.functionalProgramming;

import java.util.function.Function;

public class FirstClassFunc1 {

	protected static class MyMath {
		public static Integer triple(Integer x) {
			return x * 3;
		}
	}

	public static void main(String[] args) {

		Function<Integer, Integer> myTriple = MyMath::triple;
		Integer result = myTriple.apply(5);
		System.out.println(result);

		Function<Integer, Integer> myFunction1 = (Integer someInt) -> someInt * 2 + 1;
		System.out.println(myFunction1.apply(5));

		Function<Integer, Integer> myFunction2 = someInt -> someInt * 2 + 1;
		System.out.println(myFunction2.apply(5));

		Function<Integer, Integer> myFunction3 = (Integer someInt) -> {
			Integer resultHere = someInt * 2 + 1;
			return resultHere;
		};
		System.out.println(myFunction3.apply(5));

		Function<Integer, Integer> myFunction4 = someInt -> {
			Integer resultHere = someInt * 2 + 1;
			return resultHere;
		};
		System.out.println(myFunction4.apply(5));
	}

}
