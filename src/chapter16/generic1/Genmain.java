package chapter16.generic1;

public class Genmain {

	public static void main(String[] args) {

		Gen gen = new Gen();
		// 정수형
		Integer[] Arr1 = { 1, 2, 3, 4, 5 };
		// 더블형
		Double[] Arr2 = { 1.0, 2.0, 3.0, 4.0, 5.0 };
		// 문자형
		Character[] Arr3 = { 'A', 'B', 'C', 'D', 'E' };

		gen.printArray(Arr1);
		gen.printArray(Arr2);
		gen.printArray(Arr3);

	}

}
