package com.xworkz.java_programs.apti_program;

public class Fibonacci {
	public static void main(String[] args) {
		int a =0;
		int b =1;
		int n = 10;
		
		for(int i=0; i<=n; i++) {
			int sum=a+b;
			System.out.println(" "+sum);
				a=b;
				b=sum;
			
		}
	}

}
