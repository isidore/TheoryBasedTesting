package org.llewellynlearninghour.theorybasedtesting;

import java.util.Random;

import org.junit.Test;

public class BasicTheoryTest {

	@Test
	public void testThirdSide() {
		Random r = new Random();
		for (int i = 0; i < 100; i++) {
			int a = r.nextInt();
			int b = r.nextInt();

		}
	}

}
