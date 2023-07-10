package 능력단위평가;

public class ComputerBuilder {
	private String cpuType;
	private int ramSize;
	private int ssdSize;
	
	public ComputerBuilder cpuType(String cpuType) {
		this.cpuType = cpuType;
		return this;
	}
	public ComputerBuilder ramSize(int ramSize) {
		this.ramSize = ramSize;
		return this;
	}
	public ComputerBuilder ssdSize(int ssdSize) {
		this.ssdSize = ssdSize;
		return this;
	}
	
	public Computer build() {
		return new Computer(cpuType, ramSize, ssdSize);
	}
	
	public void showComputerInfo() {
		System.out.println("CPU 종류(intel/AMD):" + cpuType);
		System.out.println("RAM 용량(GB):" + ramSize);
		System.out.println("SSD 용량(GB):" + ssdSize);
	}
	
	Computer computer = Computer.computerBuilder()
						.cpuType("intel")
						.ramSize(16)
						.ssdSize(512)
						.build();
	public static void main(String[] args) {
		
	}
	

	
}
