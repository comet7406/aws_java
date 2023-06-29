package ch08_생성자;

public class StudentMain {
	public static void main(String[] args) {
		
		Student s1 = new Student("정혜성");
		System.out.println(s1);
//		s1.name = "정혜성";
//		s1.age = 30;
//		s1.address = "연제구";

		System.out.println(s1.name);
	}
}
