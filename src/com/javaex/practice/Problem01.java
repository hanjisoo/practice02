package com.javaex.practice;

public class Problem01 {

	public static void main(String[] args) {
			int[] data= {1,3,5,8,9,11,15,19,18,20,30,33,31};
			//data[0]
			
			int sum=0;
			int count=0;
			for(int i=0; i<13; i++) {
				
				if( data[i]%3==0) {
					sum=sum+data[i];
					count=count+1;//count++//1씩증가시킴
				
			}
				
			}
				System.out.println("주어진 배열에서 3의 배수의 개수=>"+count );
				System.out.println("주어진 배열에서 3의 배수의 합=>"+sum);

		}

}
