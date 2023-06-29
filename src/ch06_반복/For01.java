package ch06_반복;

public class For01 {
	public static void main(String[] args) {
//		int [] numbers = {1, 2, 3, 4, 5, 6};
//		
//		for(int i = 0; i < 6; i++)	{
//			System.out.println(numbers[i]);
//			System.out.println("i: " + i);
//		}
//		
		int [] itemNumbers = {2, 3, 7, 13, 15, 25, 27, 28, 33, 38, 45};
		
		for(int i = 0; i < 10; i++) {
			System.out.print(itemNumbers[i]);
			System.out.println(" [itemNumbers]: " + i);
		}
	}
}
