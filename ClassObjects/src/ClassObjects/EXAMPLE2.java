package ClassObjects;

public class EXAMPLE2 {
	public static void main(String ar[]) {
		
		sample2 x=new sample2();
		sample2 y=new sample2();
		sample2 z=new sample2();
		sample2 m=new sample2();
		sample2 x1=new sample2();
		sample2 y1=new sample2();
		sample2 z1=new sample2();
		
		
		x.a=10;
		y.b=12;
		z.c=14;
		m.f=x.a+y.b;
		x1.a=20;
		y1.b=22;
		z1.c=24;
		System.out.println("f= "+m.f);
		
	}

}
