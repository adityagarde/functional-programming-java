package com.aditya.functionalProgramming;

import java.util.function.Function;

public class ReturningFunc2 {

	protected static class MyMath {

		public static Integer multiplyTwo(Integer x) {
			return x * 2;
		}

		public static Integer multiplyThree(Integer x) {
			return x * 3;
		}

		public static Integer multiplyFour(Integer x) {
			return x * 4;
		}

		public static Function<Integer, Integer> createMultiplier(Integer y) {
			return (Integer x) -> x * y;
		}

	}

	public static void main(String[] args) {

		Function<Integer, Integer> timesTwo = MyMath.createMultiplier(2);
		System.out.println(timesTwo.apply(10));

		Function<Integer, Integer> timesThree = MyMath.createMultiplier(3);
		System.out.println(timesThree.apply(10));

		Function<Integer, Integer> timesFour = MyMath.createMultiplier(4);
		System.out.println(timesFour.apply(10));

	}

}
