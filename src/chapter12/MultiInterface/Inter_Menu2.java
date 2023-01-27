package chapter12.MultiInterface;

public interface Inter_Menu2 {

	abstract String tangsuyuck();
	abstract String jjambbong();
	
	default void show() {
		System.out.println("맛집~~");
	}
}
