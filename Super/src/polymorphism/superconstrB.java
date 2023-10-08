package polymorphism;

public class superconstrB extends superconstrA {
	 superconstrB() {
		 //super();
		System.out.println("HELLO B");
		
		
	}
	superconstrB(int b) {
		//super(10);
		System.out.println("Arguement B");
		
	}
	
	public static void main(String[] args) {
		superconstrB obj=new superconstrB(9);
	}

}
