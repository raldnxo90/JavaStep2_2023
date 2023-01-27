package chapter13;


class Out2 {

	static int a = 10;

	int b;

	public static class In {

		String Infun() {

			return (a + "번째 Static 내부 클래스");
		}
	}
}

public class EmbedMain {

	

	public static void main(String[] args) {

		// static은 클래스명으로 직접 접근이 가능함
		
	}

}
