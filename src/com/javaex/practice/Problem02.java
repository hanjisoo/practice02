package com.javaex.practice;

import java.util.Scanner;

public class Problem02 {
	public static void main(String[] args) {
		
		double ave=0;
		double sum=0;
		
		for(int i=1; i<6; i++) {
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			sum=sum+num;
			
		}
		ave=sum/5;
		System.out.println("평균은"+ave +"입니다.");
	}

}


 