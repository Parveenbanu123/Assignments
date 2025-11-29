package com.mphasis;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class NumsUtilTest {
	
	@ParameterizedTest
	@ValueSource(ints= {2,4,38,8})
	public void isEvenTest(int n) {
		assertTrue(NumsUtil.isEven(n));
	}
}
