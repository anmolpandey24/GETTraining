package com.coforge.project4.DayPROJECT;

import java.util.Scanner;

public class BinarySearch {
	
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		
		Scanner sc=new Scanner(System.in);
		int key=sc.nextInt();
		
		int low=0,high=arr.length-1;
		int mid;
		while(low<high) {
			mid=(low+high)/2;
			if(arr[mid]==key) {
				System.out.println("Element found");
				break;
			}
			else if(key>arr[mid])
				low=mid+1;
			else
				high=mid-1;
			
		}
		
		if(low>=high)
			System.out.println("not found");
	

}
}
