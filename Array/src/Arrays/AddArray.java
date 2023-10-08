package Arrays;

import java.util.Scanner;

public class AddArray {
	public static void main(String arr[]) {
		Scanner num=new Scanner(System.in);
		System.out.println("enter the limit: ");
		int n=num.nextInt();
		int a[] =new int [n];
		System.out.println("enter the limit: ");
		for(int i=0;i<n;i++) {
			 a[i]=num.nextInt();
		}
		System.out.println("Enterd values are: ");
		for(int i=0;i<n;i++) {
			System.out.println(" \n"+a[i]);
		}
		System.out.println("sum= ");
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+a[i];
		}
		System.out.println(" "+sum);
		
		
	}

}
