package com.aditya.functionalProgramming;

import java.util.function.BiFunction;

public class FuncAsArgument1 {

	public static class MyMath {
		public static Integer add(Integer x, Integer y) {
			return x + y;
		}

		public static Integer subtract(Integer x, Integer y) {
			return x - y;
		}

		public static Integer combine(BiFunction<Integer, Integer, Integer> myBiFunction) {
			return myBiFunction.apply(2, 3);
		}
	}

	public static void main(String[] args) {
		System.out.println(MyMath.combine(MyMath::add));
		System.out.println(MyMath.combine(MyMath::subtract));
		System.out.println(MyMath.combine((x, y) -> x * y));
	}

}
