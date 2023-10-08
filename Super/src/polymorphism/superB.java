package polymorphism;

public class superB extends SuperA {	
	int b;
	void display() {
		System.out.println("hello b");
		super.display();
	}
	//void hello() {
		//super.display();
	//}
public static void main(String[] args) {
	superB obj=new superB();
	obj.display();
	//obj.hello();
	
	}
}
