package 능력단위평가;

public class Computer {
	private String cpuType;
	private int ramSize;
	private int ssdSize;
	
	public Computer(String cpuType, int ramSize, int ssdSize) {
		this.cpuType = cpuType;
		this.ramSize = ramSize;
		this.ssdSize = ssdSize;
	}
	
	public static ComputerBuilder computerBuilder() {
		return new ComputerBuilder();
	}
	
	public void showComputerInfo() {
		System.out.println("CPU 종류(intel/AMD):" + cpuType);
		System.out.println("RAM 용량(GB):" + ramSize);
		System.out.println("SSD 용량(GB):" + ssdSize);
	}
	
}
