package javaInteface;

import java.util.Iterator;

public class MyCalculator implements IAdvancedArithmetic{
	public MyCalculator() {
		System.out.println("I implemented: AdvancedArithmetic");

	}	
	@Override
	public int divisorSum(int n) {
		int total = 0;
		for (int i = 1; i <=n; i++) {
			if(n % i ==0) {
				total = total +i;
			}
		}
		
		System.out.println(total);
		return total;
	}

}
