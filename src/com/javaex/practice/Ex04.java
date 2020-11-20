package com.javaex.practice;

public class Ex04 {
	
	public static void main(String[] args) {
		
		int a=0;
		int result = 0;
		
		
		int[] data = {1,3,5,8,9,11,15,19,18,20,30,33,31};
		
		int i = data[a];
		
		while(i%3==0) {
			
			
			result = result + i;
			a++;
			
					
			//System.out.println("주어진 배열에서 3의 배수의 개수" + );
			System.out.println("주어진 배열에서 3의 배수의 합" + result);
		}
			

		
	}

}
