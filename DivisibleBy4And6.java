package com.forloop;

public class DivisibleBy4And6 {

	public static void main(String[] args) {
		for (int i = 1 ; i <= 50 ; i++) {
			if (i % 4 == 0 || i % 6 == 0) {
				System.out.println(i);
			}
		}

	}

}
