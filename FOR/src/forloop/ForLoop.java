package forloop;

import java.util.Scanner;

public class ForLoop {
	public static void main(String[]arr) {
		Scanner num=new Scanner(System.in);

		System.out.println("Enter a number: ");
		int sum=0;
		int a=num.nextInt();
		for(int i=1;i<=a;i++) {
			sum=sum+i;
			
	}System.out.println("sum=  ");
		
		System.out.println(" "+sum);
	
	
}
}
