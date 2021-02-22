package com.xworkz.java_programs.apti_program;

import java.util.Scanner;

public class NoOfDaysInMonth {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int numberOfDaysInMonth = 0;
		String MonthOfName = "unknown";
		
		System.out.println("input a month number");
		int month = input.nextInt();
		
		System.out.println("input a year");
		int year = input.nextInt();
		
		switch(month) {
		case 1:
			MonthOfName = "junuary";
			numberOfDaysInMonth = 31;
			break;
		case 2:
			MonthOfName = "february";
			numberOfDaysInMonth = 28;
			break;
		case 3:
			MonthOfName = "march";
			numberOfDaysInMonth = 31;
			break;
		case 4:
			MonthOfName = "april";
			numberOfDaysInMonth = 30;
			break;
		case 5:
			MonthOfName = "may";
			numberOfDaysInMonth = 31;
			break;
		case 6:
			MonthOfName = "june";
			numberOfDaysInMonth = 30;
			break;
		case 7:
			MonthOfName = "july";
			numberOfDaysInMonth = 31;
			break;
		case 8:
			MonthOfName = "agust";
			numberOfDaysInMonth = 31;
			break;
		case 9:
			MonthOfName = "septemper";
			numberOfDaysInMonth = 30;
			break;
		case 10:
			MonthOfName = "october";
			numberOfDaysInMonth = 31;
			break;
		case 11:
			MonthOfName = "november";
			numberOfDaysInMonth = 30;
			break;
		case 12:
			MonthOfName = "december";
			numberOfDaysInMonth = 31;
			break;
			
			
		}
		System.out.println(MonthOfName+" "+ year+"has "+numberOfDaysInMonth+" days ");
		
	}

}
