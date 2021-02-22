package com.xworkz.java_programs.apti_program;

public class Factorial {
	public static void main(String[] args) {
		int fact=1;
		int number=5;
		
		for(int i=1; i<=number; i++) {
			fact=fact*i;
			
		}
		System.out.print("factorial of"+" "+number+" "+"is"+" "+fact);
		
	}

}
