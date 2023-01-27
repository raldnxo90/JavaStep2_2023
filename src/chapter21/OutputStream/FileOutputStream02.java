package chapter21.OutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream02 {
	
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = null;
		fos = new FileOutputStream("output3.txt");
		fos.write(71);
		fos.write(72);
		fos.write(73);
		
		fos.flush();//출력 버퍼 비우기
		fos.close();
	}

}
