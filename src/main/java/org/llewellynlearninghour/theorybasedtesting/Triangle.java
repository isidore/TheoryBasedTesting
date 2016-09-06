package org.llewellynlearninghour.theorybasedtesting;

public class Triangle {
	public static double getLengthOfHypotenuse(int a, int b) {
		return Line.getLength(a, 0, 0, b);
	}
}
