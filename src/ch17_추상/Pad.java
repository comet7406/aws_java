package ch17_추상;

import lombok.ToString;

@ToString(callSuper = true)
public class Pad extends SmartDevice implements Button {
	
	private boolean avilabilityPen;

	public Pad(String deviceName, double displaySize, boolean avilabilityPen) {
		super(deviceName, displaySize);
		this.avilabilityPen = avilabilityPen;
	}

	@Override
	public void connectedWiFi() {
		System.out.println();
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
