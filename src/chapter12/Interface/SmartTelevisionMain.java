package chapter12.Interface;

public class SmartTelevisionMain {

	public static void main(String[] args) {

		SmartTelevision tv = new SmartTelevision();

		tv.turnOn();
		tv.setVolume(10);
		tv.turnOff();
		tv.search("www.naver.com");
		System.out.println("-----------------");

		// Remote 클래스에 정의되어 있는 메소드만 오버라이딩
		Remote rc = tv;
		rc.turnOn();
		rc.setVolume(-7);
		rc.turnOff();
		// rc.search("wwww.naver.com);
		System.out.println("-----------------");

		Searchable sc = tv;
		/*
		 * sc.turnOn(); sc.setVolume(-7); sc.turnOff();
		 */
		sc.search("www.naver.com");
	}

}
