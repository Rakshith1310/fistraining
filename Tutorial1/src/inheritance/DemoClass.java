package inheritance;

public class DemoClass {

	public static void main(String[] args) {
		ElectronicDevices laptop1 = new Laptop(2, 1024, true);
		ElectronicDevices washingmachine1 = new WashingMachine(5, 1000);
		ElectronicDevices mobile1 = new Mobile(1, 2048, true, true);
		
		DemoClass democlass = new DemoClass();
		democlass.displayPower(laptop1);
		democlass.displayPower(washingmachine1);
		democlass.displayPower(mobile1);
	}
	public void displayPower(ElectronicDevices device){
		if (device instanceof Computer){
			System.out.println("Calculating power of Computer...");
			device.setPower(device.getPower()*2);
		}
		else if(device instanceof WashingMachine){
			System.out.println("Calculating power of Washing Machine...");
			device.setPower(device.getPower()*5);
		}
		else if(device instanceof Mobile){
			System.out.println("Calculating power of Mobile...");
			device.setPower(device.getPower());
		}
		device.calculatePower();
	}
	
}
