package chapter17.vector;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {

		Object obj;
		// 크기1의 배열 선언
		Vector<Object> vec = new Vector<Object>(1);
		obj = 20221227;
		vec.addElement(obj);// 엘리멘트 추가
		System.out.println("용량은 #1 : " + vec.capacity());
		// vector 저장되는 있는 엘리먼트의 수
		System.out.println("크기는 #1 : " + vec.size());
		System.out.println();

		obj = "some people";
		vec.addElement(obj);// 엘리멘트 추가
		System.out.println("용량은 #2 : " + vec.capacity());
		// vector 저장되는 있는 엘리먼트의 수
		System.out.println("크기는 #2 : " + vec.size());
		System.out.println();

		obj = "some people222";
		vec.addElement(obj);// 엘리멘트 추가
		System.out.println("용량은 #4 : " + vec.capacity());
		// vector 저장되는 있는 엘리먼트의 수
		System.out.println("크기는 #3 : " + vec.size());
		System.out.println();

		obj = "while";
		vec.addElement(obj);// 엘리멘트 추가
		System.out.println("용량은 #8 : " + vec.capacity());
		// vector 저장되는 있는 엘리먼트의 수
		System.out.println("크기는 #4 : " + vec.size());
		System.out.println();

		obj = "other people";
		vec.addElement(obj);// 엘리멘트 추가
		System.out.println("용량은 #8 : " + vec.capacity());
		// vector 저장되는 있는 엘리먼트의 수
		System.out.println("크기는 #5 : " + vec.size());
		System.out.println();

		obj = "get up";
		vec.addElement(obj);// 엘리멘트 추가
		System.out.println("용량은 #8 : " + vec.capacity());
		// vector 저장되는 있는 엘리먼트의 수
		System.out.println("크기는 #6 : " + vec.size());
		System.out.println();

		obj = "every morning";
		vec.addElement(obj);// 엘리멘트 추가
		System.out.println("용량은 #8 : " + vec.capacity());
		// vector 저장되는 있는 엘리먼트의 수
		System.out.println("크기는 #7 : " + vec.size());
		System.out.println();

		System.out.println(vec);

	}

}
