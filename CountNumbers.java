package com.forloop;

public class CountNumbers {

	public static void main(String[] args) {
	
		int count = 0;
		for (int i = 1 ; i <= 100; i++) {
			if (i %9 == 0) {
			count++;
			System.out.println(i);
			}	
			
		}		System.out.println("total count:"+count);

	}

}
