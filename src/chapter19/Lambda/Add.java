package chapter19.Lambda;

@FunctionalInterface
public interface Add {
	//@FunctionalInterface 인터페이스로 구현하되 추상메서드는 하나만 존재할 수 있음 
	//병렬처리 
	
	public int add(int x, int y);
	
	/*public default int sub(int n1, int n2) {
		return 0;
	}*/ 
	//다른 메소드는 올 수 있음

}
