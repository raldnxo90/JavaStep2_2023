package chapter12.MultiInterface;

public interface Sell {
	
	void sell();
	
	//같은 이름의 default 메소드는 같은 패키지에서 존재할 수 없으므로 오버라이딩 필요 
	//최종 오버라이딩 메소드가 출력됨
	
	default void sellorder() {
		System.out.println("판매 주문");
	}
}
