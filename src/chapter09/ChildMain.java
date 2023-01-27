package chapter09;

public class ChildMain {

	public static void main(String[] args) {
		
		Child child = new Child();
		
		child.method1(); //부모님 소유
		child.method2(); //자식 소유
		child.method3(); //자식 소유
		System.out.println();
		
		Parent parent1 = new Parent();
		parent1.method2();//오버라이딩은 부모 객체를 새로 생성
		System.out.println();
		
		//독립적으로 부모클래스만 사용
		Parent parent2 = child;
		parent2.method1();
		parent2.method2();
	}

}
