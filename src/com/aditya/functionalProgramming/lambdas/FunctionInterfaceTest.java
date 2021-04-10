package com.aditya.functionalProgramming.lambdas;

public class FunctionInterfaceTest {

	public static void main(String[] args) {

		Calculate oldCalc = new Calculate() {
			@Override
			public int calc(int x, int y) {
				return x * 2 + y * 2;
			}
		};
		
		System.out.println(oldCalc.calc(3, 4));

		Calculate add = (a, b) -> a + b;
		Calculate subtract = (a, b) -> a - b;
		Calculate multiply = (a, b) -> a * b;
		Calculate dvivide = (a, b) -> b != 0 ? a / b : 0;

		System.out.println(add.calc(3, 4));
		System.out.println(subtract.calc(3, 4));
		System.out.println(multiply.calc(3, 4));
		System.out.println(dvivide.calc(3, 4));
		
		Printer testPrinter = () -> System.out.println("AdityaG!");
		
		testPrinter.printMessage();
	}

}
