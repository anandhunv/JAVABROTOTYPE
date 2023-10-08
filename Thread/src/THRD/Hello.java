package THRD;

public class Hello {
	public static void main(String[] args) {
		SampleThread s=new SampleThread();
		s.start();
		SampleThread R=new SampleThread();
		R.start();
		
	}

}
