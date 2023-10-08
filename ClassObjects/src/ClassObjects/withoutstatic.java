package ClassObjects;

public class withoutstatic {
	int a=16;
	static int b=20;
	public static void main(String ar[]) {
		
		withoutstatic s=new withoutstatic();
		System.out.println(s.a);
		System.out.println(b);
		b=40;
		s.b=220;
		System.out.println(s.b);
		
		System.out.println(b);
		s.hello();
		int c=s.hello();
		System.out.println(c);
		hi();
	}
	int hello() {
		int a=10;
		return(a);

	}
	static void hi() {
		
	}

}
