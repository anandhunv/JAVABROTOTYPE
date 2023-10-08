package negorpos;

import java.util.Scanner;

public class IfSamples {
	public static void main(String arr[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		
		int a=s.nextInt();
	
		System.out.println("entered number is  "+a);
		if(a>=0) {
			System.out.println(a+"  is a Positive number");
		}
		else {
			System.out.println(a+"  is a Negative number");
		}
	}

}
