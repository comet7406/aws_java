package BaekJoon;

import java.util.Scanner;

public class 조건문01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a < 0 || a > 100) {
			System.out.println("x");
		}
		if(89 < a) {
			System.out.println("A");
		} else if(79 < a) {
			System.out.println("B");
		} else if(69 < a) {
			System.out.println("C");
		} else if(59 < a) {
			System.out.println("D");
		} System.out.println("F");
		
		System.out.println("시험 점수: " + a);
	}
}
