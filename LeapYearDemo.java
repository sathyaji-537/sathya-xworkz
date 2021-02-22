package com.xworkz.java_programs.apti_program;

import java.util.Scanner;

public class LeapYearDemo {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Input the year: ");
		int year = input.nextInt();
		
		boolean x =(year%4 == 0);
		boolean y =(year%100 != 0);
		boolean z =((year%100 == 0)&&(year%400 == 0));
		
		if (x&&(y||z)) {
			System.out.println(year+" is leap year");
			
		}
		else {
			System.out.println(year+" is not leap year");
		}
	}

}
