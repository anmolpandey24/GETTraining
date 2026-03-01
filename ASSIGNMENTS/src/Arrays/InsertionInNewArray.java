package Arrays;

import java.util.Scanner;

public class InsertionInNewArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[]arr=new int[5];
		System.out.println("Enter 5 elements:");
		
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		
		int[] newArr=new int[6];
		for(int i=0;i<5;i++) {
			newArr[i]=arr[i];
		}
		
		System.out.println("Enter 6th element to insert:");
		newArr[5]=sc.nextInt();
		
		System.out.println("Array after 6th element:");
		for(int i=0;i<6;i++) {
			System.out.println(newArr[i] + " ");
		}
		
		
		sc.close();
		
		
		
		
	}

}
