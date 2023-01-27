package chapter14.Wrapper;

//Wrapper
public class IntegerTest {

	public static void main(String[] args) {

		// Integer i = new Integer(100); //int i = 100;

		Integer num = 100;// 일반자료 => 클래스로 선언(오토박싱)

		int iNum = num.intValue(); // 클래스 => 일반자료(언박싱)

		int jNum = 200;

		int sum = iNum + jNum;
		System.out.println(sum);

		// 언박싱(Integer => int)
		int total = num + jNum;// 클래스타입+일반자료 => 자동언박싱
		System.out.println(total);

		// 오토박싱(int => Integer)
		Integer i = jNum;// 일반자료에서 클래스타입으로
		System.out.println(i); // Integer.valueOf(jNum)로 변환하는 것과 같음
	}

}
