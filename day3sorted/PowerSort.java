package day3sorted;
import inheritance.ElectronicDevices;

import java.util.Comparator;

public class PowerSort implements Comparator<ElectronicDevices>{

	@Override
	public int compare(ElectronicDevices dev1, ElectronicDevices dev2) {
		return dev1.getPower() - dev2.getPower();
		
	}
}
	
