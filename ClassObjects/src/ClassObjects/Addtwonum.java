package ClassObjects;

import java.util.Scanner;

public class Addtwonum {
	public static void main(String ar[]) {
		
		Scanner num=new Scanner(System.in);
		System.out.println("Enter two number: ");
		int a=num.nextInt();
		int b=num.nextInt();
		
		System.out.println("Enter two number: ");
		int x=num.nextInt();
		int y=num.nextInt();
		
		cls obj1=new cls();
		cls obj2=new cls();
		
		obj1.calculatesum(a,b);
		obj1.displaysum();
			
		obj2.calculatesum(x, y);
		obj2.displaysum();
		
	}

}
