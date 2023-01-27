package chapter14.String;

import java.util.Date;

class Book {
	String title;
	String author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	// String의 문자열로 출력해주는 toString 재정의
	@Override
	public String toString() {
		return title + ", " + author;
	}

}

public class ToStringEx01 {

	public static void main(String[] args) {

		Book book = new Book("자바", "홍길동");
		// 객체는 힙메모리 사용 => heap 메모리는 16진수 주솟값을 갖고 있음
		System.out.println(book);
		// System.out.println(book.toString()); //toString 메소드를 직졉 호출

		String str = new String("test");// String은 이미 toString 처리가 되어 있음
		System.out.println(str);
	}

}
