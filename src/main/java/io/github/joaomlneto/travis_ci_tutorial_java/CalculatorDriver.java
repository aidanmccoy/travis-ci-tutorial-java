package io.github.joaomlneto.travis_ci_tutorial_java;

public class CalculatorDriver {
	
	public static final void main(String[] args) {
		System.out.println("Hello world!");
		
		SimpleCalculator calc = new SimpleCalculator();
		
		int data = 12;
		data = calc.mul(data,3);
		System.out.println("The data is now " + data);

		data = calc.mul(data, 7);
		System.out.println("The data is now " + data);

		data = calc.mul(data, 13);		
		System.out.println("The data is now " + data);

		data = calc.mul(data, 37);
		System.out.println("The data is now " + data);
	}
}
