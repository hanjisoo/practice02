package com.javaex.practice;

import java.util.Scanner;

public class Problem04 {
	public static void main(String[] args) {
		System.out.print("금액: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int[] cash=new int[10];
		int[] money=new int[10];
		
		money[0]=50000;
		money[1]=10000;
		money[2]=5000;
		money[3]=1000;
		money[4]=500;
		money[5]=100;
		money[6]=50;
		money[7]=10;
		money[8]=5;
		money[9]=1;
				
		for(int i=0; i<10; i++) {
			cash[i]=num/money[i];
			num=num%money[i];
		
		}
		for(int i=0; i<10; i++) {
			System.out.println(money[i]+"원"+":"+cash[i]+"개");
		}
		/*System.out.println("50,000원:"+cash[0]);
		System.out.println("10,000원:"+cash[1]);
		System.out.println("5,000원:"+cash[2]);
		System.out.println("1,000원:"+cash[3]);
		System.out.println("500원:"+cash[4]);
		System.out.println("100원:"+cash[5]);
		System.out.println("50원:"+cash[6]);
		System.out.println("10원:"+cash[7]);
		System.out.println("5원:"+cash[8]);
		System.out.println("1원:"+cash[9]);*/
		
	}
}
