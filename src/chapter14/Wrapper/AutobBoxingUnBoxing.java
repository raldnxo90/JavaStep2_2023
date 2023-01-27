package chapter14.Wrapper;

public class AutobBoxingUnBoxing {

	public static void main(String[] args) {

		// AutoBoxing
		Integer obj = 100;
		System.out.println("value : " + obj.intValue());

		// UnBoxing
		int value = obj;
		System.out.println("value : " + value);

		// 연산 시 자동 unBoxing
		int result = obj + 100;
		System.out.println("result : " + result);

	}

}
