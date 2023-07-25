package com.preetamlahre.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.preetamlahre.junit.myMath;

class MyMathtest {
	myMath math = new myMath();
	@Test
	void calculateSum_threeMemberArray() {
	
		assertEquals(3, math.calculatesum(new int[] {1,2,3}));
	
	}
	@Test
	void calculateSum_ZeroLengthArray() {
	
		assertEquals(0, math.calculatesum(new int[] {}));
	
	}


}
