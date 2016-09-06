package org.llewellynlearninghour.theorybasedtesting;

import java.util.Arrays;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.FromDataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class JunitTheoryTest {

	@DataPoints("Numbers")
	public static Iterable<Integer> randomLivingCells() {
		return Arrays.asList(1, 2, 3, 4);
	}

	@Theory
	public void testThirdSide(@FromDataPoints("Numbers") Integer a, @FromDataPoints("Numbers") Integer b) {

	}

}
