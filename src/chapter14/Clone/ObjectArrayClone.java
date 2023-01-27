package chapter14.Clone;

import java.awt.print.Book;
import java.util.ArrayList;

class MyBook implements Cloneable {

	String title;

	public MyBook(String title) {
		this.title = title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public class ObjectArrayClone {

		@Override
		protected Object clone() throws CloneNotSupportedException {

			return super.clone();
		}

		@Override
		public String toString() {
			return title;
		}
	}

	public static void main(String[] args) {

		ArrayList<MyBook> bookList = new ArrayList<MyBook>();

		MyBook book1 = new MyBook("자바");
		MyBook book2 = new MyBook("스프링");
		MyBook book3 = new MyBook("파이썬");

		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);

		ArrayList<MyBook> copyList = (ArrayList) bookList.clone();
		copyList.add(new MyBook("Oracle"));
		System.out.println(bookList);
		System.out.println(copyList);

		book3.setTitle("C++");
		System.out.println(bookList);
		System.out.println(copyList);

	}
}
