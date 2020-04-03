package com.jse.app;

public class Sum1To5 {
	public static void main(String[] args) {
		sum();
	}

	static void sum() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			
			System.out.println(i);
		
			sum += i; 
		}
		System.out.println("합 : "+sum);

	}
}
