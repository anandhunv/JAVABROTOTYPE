package lib;

public class Sample extends Library1 {
	
	@Override
	void ontext(String text) {
		System.out.println(text);
		
		
	}
	Sample(){
		
		TextScanner ts=new TextScanner(this);
		ts.scan();
		
	}
	public static void main(String[] args) {
		Sample s=new Sample();	}

}
