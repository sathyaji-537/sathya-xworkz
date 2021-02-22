package com.xworkz.java_programs.apti_program;

/*1 to 50 numbers are divisible by 3 and 5 */ 

public class NumberDemo {
	
	public static void main(String[] args) {
		
	
	for(int i=1 ; i<=50 ; i++) {
		if(i%3 == 0 && i%5 == 0) {
			System.out.println("number divisible by 3&5 :" + i);
		}
		
		else if(i%3 == 0) {
			System.out.println("number divisible by 3 :" + i);
	}
}
	}
}



