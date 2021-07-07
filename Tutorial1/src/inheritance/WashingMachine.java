package inheritance;

public class WashingMachine extends ElectronicDevices{
	int rpm;
	public WashingMachine(int power, int rpm){
		super(power);
		this.rpm = rpm;
	}

}

