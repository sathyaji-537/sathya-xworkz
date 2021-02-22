package com.xworkz.java_programs.apti_program;

public class FactDemo {
	public static void main(String[] args) {
		int n=6;
		int fact=1;
		for(int i=1; i<=n; i++) {
		
	   if(n>=fact) {
		   fact = fact*i;
		   }
	   else {
		   return;
	   }
	   System.out.println(fact);
		}

	}

}
