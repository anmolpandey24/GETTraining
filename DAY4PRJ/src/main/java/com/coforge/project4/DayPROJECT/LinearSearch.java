package com.coforge.project4.DayPROJECT;
import java.util.*;

public class LinearSearch {
	
	public static void main(String[] args) {
		int arr[]= {12,45,56,67,89};
		Scanner sc=new Scanner(System.in);
		int key=sc.nextInt();
		for(int i=0;i<arr.length;i++)
			if(arr[i]==key) {
				
				System.out.println("element found");
		        break;
			}
		if(i==arr.length)
			System.out.println("not found");
		        
		
	

}
