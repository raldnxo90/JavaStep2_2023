package chapter19.Lambda;

public class TestAdd {

	public static void main(String[] args) {
		//Lambda : 메서드 이름이 없음, 매개변수와 구현부만 존재함
		Add addF = (x,y) -> x+y;	
		System.out.println(addF.add(3, 5));
	}
}
