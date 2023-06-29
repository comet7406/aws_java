package ch07_클래스.overloading;

public class PhoneMain {
	public static void main(String[] args) {
		Phone phone = new Phone();
		
		phone.send();
		phone.send("안녕하세요");
		phone.send("01077097406", "하이");
		phone.send("하이", 2);
	}
}
