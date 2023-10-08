package funct;

import java.util.Scanner;

public class FunctionSmple {

	public static void main(String arr[]) {
		
		Scanner num=new Scanner(System.in);
		System.out.println("ENTER TWO NUMBER: ");
		
		int a=num.nextInt();
		int b=num.nextInt();
	
		int c=sum(a,b);
		System.out.println("sum= "+c);
		return;
	}

 static int  sum(int num1,int num2) {

	int result=num1+num2;
	return (result);
}
}