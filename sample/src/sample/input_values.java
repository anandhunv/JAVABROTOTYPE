package sample;

import java.util.Scanner;

public class input_values {
	public static void main(String ar[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two number: ");
	
		int a=s.nextInt();
		int b=s.nextInt();
		
		int c=a+b;
	
		System.out.println("entered numbers are: "+a+" "+ b);
		System.out.println("sum= "+c);
	}
}