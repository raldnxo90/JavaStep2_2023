package chapter21.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedFileCopyTest2 {

	public static void main(String[] args) {

		long millisecond = 0;

		try (FileInputStream fis = new FileInputStream("a.zip");
				FileOutputStream fos = new FileOutputStream("copy.zip"); 
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos))
				{

		
			int i;
			while ((i = fis.read()) != -1) {
				
				fos.write(i);
				
			}
			millisecond = System.currentTimeMillis()-millisecond;
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일 복사하는 데 "+millisecond+"millisecond 소요되었습니다.");
	}

}
