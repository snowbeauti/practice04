package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double[] num = new double[5];
		
		double sum=0;
		double average=0;  
		
		num[0] = sc.nextInt();
		num[1] = sc.nextInt();
		num[2] = sc.nextInt();
		num[3] = sc.nextInt();
		num[4] = sc.nextInt();
		
		for(int i=0; i<num.length; i++) {
		sum = sum + num[i];
		average = sum / (i + 1);
		}
		
		System.out.println("평균은 " + average + " 입니다.");
		
		sc.close();
	}

}
