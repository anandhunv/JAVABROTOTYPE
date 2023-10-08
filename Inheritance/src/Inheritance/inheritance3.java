package Inheritance;

public class inheritance3 {
	public static void main(String[] args) {
		inheritance2 B=	new inheritance2();
		B.display();
		B.displayB();
		B.num=10;
		B.a=20;
		int c= 	B.a+B.num;
		System.out.println(c);
	}

}
