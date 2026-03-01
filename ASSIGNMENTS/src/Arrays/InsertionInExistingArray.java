package Arrays;

import java.util.Scanner;

public class InsertionInExistingArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []arr=new int[6];
		int n=5;
		System.out.println("Enter 5 elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter element to insert:");
		int element=sc.nextInt();
		
		System.out.println("Enter position:" +n);
		int pos=sc.nextInt();
		
		if(pos<0 || pos>n) {
			System.out.println("Invalid position");
		}
		else {
			for(int i=n;i>pos;i--) {
				arr[i]=arr[i-1];
			}
			arr[pos]=element;
			n++;
			
			System.out.println("Array After Insertion:");
			for(int i=0;i<n;i++) {
				System.out.println(arr[i] + " ");
			}
		}
		
		sc.close();
	}

}
