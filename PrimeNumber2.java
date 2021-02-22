package com.xworkz.java_programs.apti_program;

public class PrimeNumber2 {
	public static void main(String[] args) {
		
		int num = 5;
		int count = 0;
		
		for(int i=2; i<=num/2; i++) {
			if(num%i == 0) {
				count++;
			}
		}
		if(count == 0) {
			System.out.println( num+" "+"is prime number");
		}
		else {
			System.out.println( num+" "+"is not prime number");
		}
		
	}

}
