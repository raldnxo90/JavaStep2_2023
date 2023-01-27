package chapter12.Interface;

//상속받아서 times/divide 구현
public class CompleteCalc2 extends CompleteCalc1 {

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		/*try {
			return num1/num2;
		} catch (Exception e) {
			return Calc.ERROR;
		}*/	
		if(num2!=0) {
			return num1/num2;
		}else {
			return Calc.ERROR;
		}//else
		
	}//main
	
}//class

