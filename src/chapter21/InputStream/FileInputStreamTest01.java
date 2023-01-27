package chapter21.InputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest01 {

	public static void main(String[] args) {
		/*
		 * try (FileInputStream fis = new FileInputStream("Input.txt")) {
		 * System.out.println((char)fis.read()); System.out.println((char)fis.read());
		 * System.out.println((char)fis.read());
		 * 
		 * } catch (IOException e) { e.printStackTrace(); }
		 */
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("Input.txt");
			System.out.println((char) fis.read());
			System.out.println((char) fis.read());
			System.out.println((char) fis.read());

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("end");
	}

}
