package org.llewellynlearninghour.theorybasedtesting;

public class Line {
	public static Double getLength(Integer x1, Integer y1, Integer x2, Integer y2) {
		int x = x2 - x1;
		int y = y2 - y1;
		return Math.sqrt(x * x + y * y);
	}
}
