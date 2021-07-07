package inheritance;

public class Computer extends ElectronicDevices {
	boolean bluetooth;
	int memory;
	
	public Computer(int power, int memory, boolean bluetooth){
		super(power);
		this.memory = memory;
		this.bluetooth = bluetooth;
	}
	
}
