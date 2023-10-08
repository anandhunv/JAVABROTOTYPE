package Arrays;

import java.util.Scanner;

public class Array {
	public static void main(String arr[]) {
		Scanner num=new Scanner(System.in);
		
		System.out.println("enter the limit: ");
		int n=num.nextInt();
		int a[]=new int[n];
		System.out.println("enter number: ");
		for(int i=0;i<n;i++) {
			a[i]=num.nextInt();
		}
		System.out.println("entered five numbers are: ");
		for(int i=0;i<n;i++) {
			System.out.println("  "+a[i]);
		}
		
	
		
		
		
		
	}
}
