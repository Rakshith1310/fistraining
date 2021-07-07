package inheritance;

public class ElectronicDevices {
	private int power;
	//int memory;
	//boolean bluetooth;
	public ElectronicDevices(int power)
	{
		this.power = power;
	}
	
	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
	
	public void calculatePower(){
		System.out.println("Calculating power of electronic device..."+power*1000);
		
	}
}
