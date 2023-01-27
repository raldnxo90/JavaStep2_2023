package chapter10;

import javax.swing.JOptionPane;

public class CalMain{
	public static void main(String[] args) {
	
	int n1 = Integer.parseInt(JOptionPane.showInputDialog("값을 입력하시오 "));
	int n2 = Integer.parseInt(JOptionPane.showInputDialog("값을 입력하시오 "));
	
	CalPlus cp = new CalPlus();
	CalMinus cm = new CalMinus();
	
	System.out.println("CalPlus : " + cp.getResult(n1,n2));
	System.out.println("CalMinus : "+ cm.getResult(n1,n2));
	
	int plus = calc(new CalPlus(), 20, 10);//Calc c1 = new CalcPlus();
	System.out.println("두 수의 합 : "+plus);
	}
	
	
	
	public static int calc(CalculatorExam c1, int a, int b) {
		return c1.getResult(a, b);
		
	}

}


//getClass().getSimpleName():클래스명 가져오기