package chapter14.Clone;

public class ArrayClonetest {
	
	public static void main(String[] args) {
		
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2;
		
		arr2 = arr1.clone();
		System.out.println("복사된 arr2배열");
		
		for(int num : arr2) {
			System.out.print(num+" ");
		}
		
		arr2[3] = 0;
		System.out.println("\n변경 후 arr1 배열");
		for(int num : arr1) {
			System.out.print(num+" ");
		}
		System.out.println("\n변경 후 arr2 배열");
		for(int num : arr2) {
			System.out.print(num+" ");
		}
		
	}

}
