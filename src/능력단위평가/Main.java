package 능력단위평가;

public class Main {
	public static void main(String[] args) {
		Computer computer = Computer.computerBuilder()
				.cpuType("intel")
				.ramSize(16)
				.ssdSize(512)
				.build();
		
		System.out.println(computer);
	}
}
