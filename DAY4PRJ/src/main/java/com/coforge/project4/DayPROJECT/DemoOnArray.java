package com.coforge.project4.DayPROJECT;

import java.util.Scanner;

public class DemoOnArray {
	public static void main(String[] args) {
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		int sum=0;
		System.out.println(" Sum of Array elements:");
		for(int i=0;i<arr.length;i++)
			sum=sum+arr[i];
			System.out.println(sum);
		
	}
	

}
