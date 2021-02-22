package com.xworkz.java_programs.apti_program;

import java.util.Scanner;

public class GreatestNumber {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("input the first number");
		int no1 = scanner.nextInt();
		System.out.println("input the second number");
		int no2 = scanner.nextInt();
		System.out.println("input the third number");
		int no3 = scanner.nextInt();
		
		if(no1>no2)
			if (no1>no3) {
			System.out.println("the greatest no is: "+no1);
		}
		if(no2>no1)
			if(no2>no3) {
			System.out.println("the greatest no is: "+no2);
		}
		if(no3>no2)
			if(no3>no1) {
			System.out.println("the greatest no is: "+no3);
		}
	}

}
