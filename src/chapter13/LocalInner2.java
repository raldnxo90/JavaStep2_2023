package chapter13;

class Outer{
	//외부 클래스 멤버변수
	int outNum = 100;
	static int sNum = 100;
	
	//Runnable 매개변수와 멤버변수는 final로 정의된다.
	//Runnable은 Data 영역에 들어가며 익명의 클래스라고 한다.
	Runnable getRunnable(int i) {
		int num = 100; //final
		
		class MyRunnable implements Runnable{
			int localNum = 10;//내부클래스의 멤버변수
			
			@Override
			public void run() {
				//num = 200; - 재정의 불가 
				//i = 100; - 재정의 불가
				System.out.println("i=" + i);
				System.out.println("num=" + num);
				System.out.println("localNum=" + localNum);
				System.out.println("oitNum=" + outNum);
				
				System.out.println("outter.sNum="+Outer.sNum+"(외부Data영역)");
			}//run
			
		}//Runnable
		
		return null;
		
	}//method
}//외부 클래스

public class LocalInner2 {
	
	public static void main(String[] args) {
		Outer out = new Outer();
		Runnable runner = out.getRunnable(10);
		runner.run();
	}

}
