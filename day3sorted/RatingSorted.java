package day3sorted;
import inheritance.ElectronicDevices;

import java.util.Comparator;


public class RatingSorted implements Comparator<ElectronicDevices>{

	@Override
	public int compare(ElectronicDevices dev1, ElectronicDevices dev2) {
		// TODO Auto-generated method stub
		return dev1.getRatings() - dev2.getRatings();
	}
	
	
		
	}


