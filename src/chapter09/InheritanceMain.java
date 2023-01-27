package chapter09;

public class InheritanceMain {

	public static void main(String[] args) {
		StrawBerry obj =new StrawBerry();
		
		obj.set1("Berry", "여름");
		obj.set2("딸기", "중");
		obj.set3("빨강", 7000);
		obj.Disp1(); 
		System.out.println("---------");
		obj.Disp2(); 
		System.out.println("---------");
		obj.Disp3(); 
	}

}
