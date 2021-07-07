package inheritance;

public class Mobile extends ElectronicDevices{
	private int memory;
	private boolean bluetooth;
	private boolean duelsim;
	
	public Mobile(int power, int memory, boolean bluetooth, boolean duelsim){
		super(power);
		this.memory = memory;
		this.bluetooth = bluetooth;
		this.duelsim = duelsim;
	}
}
