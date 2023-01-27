package chapter14.Clone;

public class ObjectCloneMain {

	public static void main(String[] args) throws CloneNotSupportedException {

		Circle circle = new Circle(10, 20, 30);
		Circle circleCopyCircle = (Circle)circle.clone();
		
		System.out.println(circle);
		System.out.println(circleCopyCircle);
		
		//hash값
		
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(circleCopyCircle));
	}
	

	
}
