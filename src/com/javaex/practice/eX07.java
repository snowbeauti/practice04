package com.javaex.practice;

import java.util.Scanner;

public class eX07 {
	
	public static void main(String[] args) {
		
		int[] won = {50000,10000,5000,1000,500,100,50,10,5,1};
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("금액: ");
		int a = sc.nextInt();
		
		for(int i=0; i<won.length; i++){
			if(a/won[i]>0) {
			System.out.println(won[i] + "원: " + a/won[i] + "개");
			a %=won[i];
			}
			
		}
		sc.close();
	}

}
