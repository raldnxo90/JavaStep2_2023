package chapter19.Lambda;

public class TestMyNumber {

	public static void main(String[] args) {

		// 인스턴스 변수방에 구현부를 저장
		MyNumber max = (x, y) -> (x >= y) ? x : y;
		// 구현부를 대입하여 실행함
		System.out.println(max.getMax(3, 4));

		/*
		 * MyNumber aa = new MyNumber() {
		 * 
		 * @Override public int getMax(int num1, int num2) { int max=(num1>=num2)?
		 * num1:num2; return 0; } };
		 */
	}
}
