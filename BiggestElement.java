package com.xworkz.java_programs.apti_program;

	public class BiggestElement {
		public static void main(String[] args) {
			
			int[] arr = {20,150,10,130,30,40,50,80,100};
			
			int fBig = arr[0];
			int sBig = arr[1];
			
			for(int i=0; i<arr.length; i++) {
				if(fBig<arr[i]) {
					sBig = fBig;
					fBig = arr[i];
				}
				else if(sBig<arr[i] && arr[i]!=fBig) {
					sBig = arr[i];
				}
				
			}
			System.out.println("first biggest element is :" + fBig);
			System.out.println("second biggest element is :" + sBig);
			
		}

	}



