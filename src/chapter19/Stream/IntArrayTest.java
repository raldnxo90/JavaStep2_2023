package chapter19.Stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		//한번 생성된 스트림은 재 사용 시 다시 생성
		//sum() Integer로 반환하므로 int로
		int sumVal = Arrays.stream(arr).sum();			//합계
		//count는 long 타입이므로 int로 캐스팅
		int count = (int)Arrays.stream(arr).count();	//개수
		
		System.out.println(sumVal);
		System.out.println(count);
		
		//int => IntStream 형변환
		IntStream stream = Arrays.stream(arr);
		int sum = stream.sum();
		System.out.println(sum);
		
		//이미 사용되었으므로 소멸된 stream
		//count = stream.count(); //ERROR
		int count2 = (int)Arrays.stream(arr).count();//재선언만 가능
		//reduce(초깃값, 전달되는 요소 -> 각 요소가 수행해야 하는 기능)
		System.out.println(Arrays.stream(arr).reduce(0,(a,b) -> a+b));
		
	}

}
