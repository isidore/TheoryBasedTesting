package org.llewellynlearninghour.theorybasedtesting;

import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.From;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.java.lang.IntegerGenerator;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

@RunWith(JUnitQuickcheck.class)
public class QuickcheckTest {

	@Property(trials = 10000)
	public void testThirdSide(@From(IntegerGenerator.class) Integer a, @From(IntegerGenerator.class) Integer b) {

	}

}
