package com.xworkz.java_programs.apti_program;

public class FibonacciWhileDemo {
	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int n=10;
		
		int i=1;
		int sum=0;
		
		while(i<n) {
			sum=a+b;
			
			i++;
			
		}
		a=b;
		b=sum;
		System.out.println(sum);

	}

}
