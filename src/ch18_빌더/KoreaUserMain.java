package ch18_빌더;

public class KoreaUserMain {

	public static void main(String[] args) {
		
		KoreaUser koreaUser = KoreaUser.builder().userId(1).build();
//		KoreaUser koreaUser = KoreaUser.builder()
//				.userId(1)
//				.username("aaa")
//				.password("1234")
//				.name("정혜성")
//				.email("aaa.@gmail.com")
//				.build();
		
		System.out.println(koreaUser);
//
	}
	
}
