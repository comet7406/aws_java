package ch07_클래스;

public class BMain {
	
	public static void main(String[] args) {
		B b1 = new B();
		b1.test1();
		System.out.println("=====================");
		int num1 = b1.test2();
		System.out.println("=====================");
		System.out.println(num1);
		System.out.println("=====================");
		System.out.println(b1.test2());
		System.out.println("=====================");
		
		if(b1.test3()) {
			System.out.println("if문을 실행.");
		}
		
		System.out.println("=====================");
		
		b1.test4("정혜성", 30);
		b1.test4(30, "정혜성");
	}
}
