package chapter09;

public class A {
	//같은 패키지에서는 protected라고 해도 public
	//다른 패키지에서는 private 역할
	protected String field; //public이지만 상속전용
	
	
	//생성자
	
	protected void method() {
		System.out.println("A Class");
		System.out.println("field");
	}
}
