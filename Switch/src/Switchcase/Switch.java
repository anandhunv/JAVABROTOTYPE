package Switchcase;

import java.util.Scanner;

public class Switch {
	public static void main(String ar[]){
		Scanner num=new Scanner(System.in);
		System.out.println("press\n1.for biriyani\n2.for chapathi\n3.for Alfam\n4.for vada");
		System.out.println("enter your choice: ");
		int choice=num.nextInt();
		System.out.println(" you eneterd  "+choice);
		
	
	switch(choice) {
	case 1:
	System.out.println("You orderd Biriyani");
	break;
	case 2:
		System.out.println("You Orderd Chappati");
		break;
	case 3:
		System.out.println("You Ordered Alfam");
		break;
	case 4:
		System.out.println("You Ordered Vada");
		break;
	default:
		System.out.println("you are a fool");
		
	}

}
}
