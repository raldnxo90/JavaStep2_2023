package chapter14.Wrapper;

public class ValueCompareExam {
	
	public static void main(String[] args) {
		//오토박싱 상황에서는 1byte 초과 시 비교판단이 안된다.
		System.out.println("[-128 ~ 128 초과값일 경우]");//1byte = 8bit
		Integer obj1 = 300;//4바이트 => 32비트
		Integer obj2 = 300;//4바이트 => 32비트
		
		//주소를 비교
		System.out.println("==결과 : "+(obj1 == obj2));//외부 주솟값
		System.out.println("==언박싱한 후 결과 : "+(obj1.intValue() == obj2.intValue()));//내부 데이터값
		System.out.println("==equals 결과 : "+obj1.equals(obj2));
		
		System.out.println("[-128 ~ 128 초과값일 경우]");//1byte = 8bit
		Integer obj3 = 100;//4바이트 => 32비트
		Integer obj4 = 100;//4바이트 => 32비트
		
		//주소를 비교
		System.out.println("==결과 : "+(obj3 == obj4));//외부 주솟값
		System.out.println("==언박싱한 후 결과 : "+(obj3.intValue() == obj4.intValue()));//내부 데이터값
		System.out.println("==equals 결과 : "+obj3.equals(obj4));
		
										
	}

}
