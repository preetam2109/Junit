package com.preetamlahre.junit;

public class myMath {
	public int calculatesum(int []numbers) {
		int sum=0;
		for(int number:numbers) {
			sum+=number;
		}
		return sum;
	}

}
