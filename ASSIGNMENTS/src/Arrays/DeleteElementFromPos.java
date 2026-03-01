package Arrays;

import java.util.Scanner;

public class DeleteElementFromPos {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []arr=new int[10];
		int n;
		System.out.println("Enter no of elements:");
		n=sc.nextInt();
		System.out.println("Enter elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter index to delete:");
		int index=sc.nextInt();
		
		
		
		if(index<0 || index>=n) {
			System.out.println("Invalid position");
		}
		else {
			for(int i=index;i<n-1;i++) {
				arr[i]=arr[i+1];
			}
			n--;
			
			
			System.out.println("Array After Deletion:");
			for(int i=0;i<n;i++) {
				System.out.println(arr[i] + " ");
			}
		}
		
		sc.close();
	}
}
