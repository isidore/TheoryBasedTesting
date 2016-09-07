package org.llewellynlearninghour.theorybasedtesting;

public class MathStuff {
	public static double calculate(double amount) {
		int step1 = (int) (amount * 2);
		double step2 = step1 * 1.5;
		return step2;
	}

	public static double calculate2(double amount) {
		return amount * 3;
	}
}
